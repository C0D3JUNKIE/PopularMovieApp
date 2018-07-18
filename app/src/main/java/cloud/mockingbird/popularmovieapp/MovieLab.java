package cloud.mockingbird.popularmovieapp;

import android.content.Context;
import android.database.CursorWrapper;

import java.util.ArrayList;
import java.util.List;

public class MovieLab {

    private static MovieLab movieLab;

    private List<Movie> movies;

    public static MovieLab get(Context context){
        if(movieLab == null){
            movieLab = new MovieLab(context);
        }
        return movieLab;
    }

    private MovieLab(Context context){
        movies = new ArrayList<>();
    }

    public List<Movie> getMovies(){
        return movies;
    }

    public Movie getMovie(int id){
        for(Movie movie:movies){
            if(movie.getMovieId() == id){
                return movie;
            }
        }
        return null;
    }

}
