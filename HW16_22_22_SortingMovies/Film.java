package HW_Java.HW16_22_22_SortingMovies;

public class Film {
    private String movieTitle;
    private int movieRating;
    private  String movieGenre;
    private int year;

    public Film(String movieTitle, int movieRating, String movieGenre, int year) {
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.movieGenre = movieGenre;
        this.year = year;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return " Film " +
                "| movie Title  - " + movieTitle +
                "| movie Rating - " + movieRating +
                "| movie Genre - " + movieGenre +
                "| year - " + year;
    }
}
