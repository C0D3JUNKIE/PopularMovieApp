package cloud.mockingbird.popularmovieapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class MovieListFragment extends Fragment{

    private RecyclerView movieRecyclerView;
    private MovieAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);
        movieRecyclerView = (RecyclerView) view.findViewById(R.id.rv_movie_list);
        movieRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        updateUI();
        return view;
    }

    private void updateUI(){
        MovieLab movieLab = MovieLab.get(getActivity());
        List<Movie> movies = movieLab.getMovies();
        adapter = new MovieAdapter(movies);
        movieRecyclerView.setAdapter(adapter);
    }

    private class MovieHolder extends RecyclerView.ViewHolder{

        private Movie movie;
        private ImageView moviePoster;

        public MovieHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.grid_item_movie, parent, false));
            moviePoster = (ImageView) itemView.findViewById(R.id.iv_movie_poster);
        }

        public void bind(Movie movie){
            this.movie = movie;

        }
    }

    private class MovieAdapter extends RecyclerView.Adapter<MovieHolder>{

        private List<Movie> movies;

        public MovieAdapter(List<Movie> movies){
            this.movies = movies;
        }

        @NonNull
        @Override
        public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
