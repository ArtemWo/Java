package HW_Java.HW16_22_22_SortingMovies.Comparator;

import HW_Java.HW16_22_22_SortingMovies.Film;

import java.util.Comparator;

public class ComparatorMoviaRating implements Comparator<Film> {

    @Override
    public int compare(Film rating1, Film rating2) {
        return rating1.getMovieRating()-rating2.getMovieRating();
    }
}
