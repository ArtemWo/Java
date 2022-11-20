package HW_Java.HW16_22_22_SortingMovies.Comparator;

import HW_Java.HW16_22_22_SortingMovies.Film;

import java.util.Comparator;

public class ComparatorMovieTitle implements Comparator<Film> {

    @Override
    public int compare(Film title1, Film title2) {
        return title1.getMovieTitle().compareTo(title2.getMovieTitle());
    }
}
