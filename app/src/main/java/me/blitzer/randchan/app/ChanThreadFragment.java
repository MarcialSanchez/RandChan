package me.blitzer.randchan.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import java.util.List;

import me.blitzer.randchan.app.rest.ChanApiEndPoints;
import me.blitzer.randchan.app.rest.model.boards.BoardsJsonModel;
import me.blitzer.randchan.app.rest.model.catalog.CatalogJsonModel;
import me.blitzer.randchan.app.rest.model.thread.ThreadJsonModel;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

import static com.squareup.okhttp.logging.HttpLoggingInterceptor.Level.BODY;
/**
 * A placeholder fragment containing a simple view.
 */
public class ChanThreadFragment extends Fragment {

    ArrayAdapter<String> listAdapter;

    public ChanThreadFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.chanthreadfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        if (item.getItemId() == R.id.action_random_thread) {
            FetchTextThread task = new FetchTextThread();
            ThreadJsonModel data = task.run();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        return rootView;
    }

    public class FetchTextThread{
        private final String LOG_TAG = this.getClass().getSimpleName();
        ChanApiEndPoints service;
        String board;
        Long threadnumber;
        ThreadJsonModel threadData;

        protected ThreadJsonModel run(Void... params) {
            ThreadJsonModel threadData = null;

            setDataFromRandomThread();

            return threadData;
        }

        private void setDataFromRandomThread(){
            service = makeApiService(makeHttpClient());
            Call boards = service.getBoards();
            boards.enqueue(new Callback<BoardsJsonModel>() {

                @Override
                public void onResponse(Response<BoardsJsonModel> response, Retrofit retrofit) {
                    setRandomBoardFromList(response.body());
                    Call catalog = service.getCatalog(board);
                    catalog.enqueue(new Callback<List<CatalogJsonModel>>() {

                        @Override
                        public void onResponse(Response<List<CatalogJsonModel>> response, Retrofit retrofit) {
                            setRandomThreadFromList(response.body());
                            Call thread = service.getThread(board, threadnumber);
                            thread.enqueue(new Callback<ThreadJsonModel>() {

                                @Override
                                public void onResponse(Response<ThreadJsonModel> response, Retrofit retrofit) {
                                    setThreadData(response.body());
                                    Log.e(LOG_TAG,"Posting DATA:");//todo continuar aqui
                                }

                                @Override
                                public void onFailure(Throwable t) {
                                    Log.e(LOG_TAG,"Callback thread error");
                                    t.printStackTrace();
                                }

                            });
                        }

                        @Override
                        public void onFailure(Throwable t) {
                            Log.e(LOG_TAG,"Callback catalog error");
                            t.printStackTrace();
                        }

                    });
                }

                @Override
                public void onFailure(Throwable t) {
                    Log.e(LOG_TAG,"Callback boards error");
                    t.printStackTrace();
                }

            });
        }
        private void setRandomBoardFromList(BoardsJsonModel jsonBoards){

            int random = (int )(Math.random() * jsonBoards.getBoards().size());
            board = jsonBoards.getBoards().get(random).getBoard();
        }
        private void setRandomThreadFromList(List<CatalogJsonModel> jsonCatalog){
            int random = (int )(Math.random() * jsonCatalog.get(0).getThreads().size());
            threadnumber = jsonCatalog.get(0).getThreads().get(random).getNo();
        }
        private void setThreadData(ThreadJsonModel jsonThread){
            threadData = jsonThread;
        }
    }


    private static OkHttpClient makeHttpClient() {
        OkHttpClient client = new OkHttpClient();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(BODY);
        client.interceptors().add(interceptor);
        return client;
    }

    static ChanApiEndPoints makeApiService(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://a.4cdn.org/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ChanApiEndPoints.class);
    }
}
