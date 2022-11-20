package HW_Java.HW16_22_22_SortingMovies.Comparator;

import HW_Java.HW16_22_22_SortingMovies.Film;

import java.util.Comparator;

public class ComparatorMoviaGener implements Comparator<Film> {

    @Override
    public int compare(Film gener1, Film gener2) {
        return gener1.getMovieGenre().compareTo(gener2.getMovieGenre());
    }
}
