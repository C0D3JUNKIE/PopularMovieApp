package cloud.mockingbird.popularmovieapp;

public class Movie {

    private static int movieId;
    private static String movieTitle;
    private static String movieRating;
    private static String moviePoster;
    private static String moviePlot;

    public Movie(){

    }

    public Movie(int id, String title, String rating, String poster, String plot) {

        movieId = id;
        movieTitle = title;
        movieRating = rating;
        moviePoster = poster;
        moviePlot = plot;

    }

    public static int getMovieId() {
        return movieId;
    }

    public static String getMovieTitle() {
        return movieTitle;
    }

    public static String getMovieRating() {
        return movieRating;
    }

    public static String getMoviePoster() {
        return moviePoster;
    }

    public static String getMoviePlot() {
        return moviePlot;
    }

}
