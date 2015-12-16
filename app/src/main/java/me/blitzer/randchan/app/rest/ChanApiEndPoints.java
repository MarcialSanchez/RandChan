package me.blitzer.randchan.app.rest;

import java.util.List;

import me.blitzer.randchan.app.rest.model.boards.BoardsJsonModel;
import me.blitzer.randchan.app.rest.model.catalog.CatalogJsonModel;
import me.blitzer.randchan.app.rest.model.thread.ThreadJsonModel;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by blitzer on 1/12/15.
 */
public interface ChanApiEndPoints {
    @GET("boards.json")
    Call<BoardsJsonModel> getBoards();

    @GET("{board}/catalog.json")
    Call<List<CatalogJsonModel>> getCatalog(@Path("board") String board);

    @GET("{board}/thread/{threadnumber}.json")
    Call<ThreadJsonModel> getThread(@Path("board")String board, @Path("threadnumber")Long threadnumber);
}
