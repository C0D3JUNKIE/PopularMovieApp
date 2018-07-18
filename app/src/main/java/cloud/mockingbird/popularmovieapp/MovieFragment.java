package cloud.mockingbird.popularmovieapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class MovieFragment extends Fragment {

    private Movie movie;
    private ImageView movieThumbnail;
    private TextView movieTitle;
    private TextView movieReleaseDate;
    private TextView movieRating;
    private TextView moviePlot;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movie = new Movie();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        movieThumbnail = view.findViewById(R.id.iv_movie_poster_thumb);
        movieTitle = view.findViewById(R.id.tv_movie_title);
        movieRating = view.findViewById(R.id.tv_user_rating);
        movieReleaseDate = view.findViewById(R.id.tv_release_date);
        moviePlot = view.findViewById(R.id.tv_plot);
        return view;
    }


}
