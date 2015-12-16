package me.blitzer.randchan.app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by blitzer on 16/12/15.
 */
public class ThreadAdapter extends RecyclerView.Adapter<ThreadAdapter.ThreadViewHolder>{


    private List<String> data;

    public ThreadAdapter(@NonNull List<String> data) {
        this.data = data;
    }

    @Override
    public ThreadViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_posts, parent, false);
        ThreadViewHolder pvh = new ThreadViewHolder(row);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ThreadViewHolder holder, int position) {
        String post = data.get(position);
        holder.getTitleTextView().setText(Html.fromHtml(post));

        //todo aqui se asignaría la imagen del post
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ThreadViewHolder extends RecyclerView.ViewHolder {
        //private View circleView;
        private TextView titleTextView;

        public ThreadViewHolder(View itemView) {
            super(itemView);
            //circleView = itemView.findViewById(R.id.circleView); //todo aqui nuestra imagen del post
            titleTextView = (TextView) itemView.findViewById(R.id.list_item_posts_textview);
        }

        public TextView getTitleTextView() {
            return titleTextView;
        }

//            public View getCircleView() {  // para la imagen
//                return circleView;
//            }

    }

    public void clean(){
        data.clear();
    }

    public void add(String newdata){

        data.add(newdata);
        notifyDataSetChanged();
    }



        /*private ThreadJsonModel data;

        public ThreadAdapter(@NonNull ThreadJsonModel data) {
            this.data = data;
        }

        @Override
        public ThreadViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_posts, parent, false);
            ThreadViewHolder pvh = new ThreadViewHolder(row);
            return pvh;
        }

        @Override
        public void onBindViewHolder(ThreadViewHolder holder, int position) {
            Post post = data.getPosts().get(position);
            holder.getTitleTextView().setText(post.getCom());

            //todo aqui se asignaría la imagen del post
        }

        @Override
        public int getItemCount() {
            return data.getPosts().size();
        }

        public static class ThreadViewHolder extends RecyclerView.ViewHolder {
            //private View circleView;
            private TextView titleTextView;

            public ThreadViewHolder(View itemView) {
                super(itemView);
                //circleView = itemView.findViewById(R.id.circleView); //todo aqui nuestra imagen del post
                titleTextView = (TextView) itemView.findViewById(R.id.list_item_posts_textview);
            }

            public TextView getTitleTextView() {
                return titleTextView;
            }

//            public View getCircleView() {  // para la imagen
//                return circleView;
//            }

        }*/
}
