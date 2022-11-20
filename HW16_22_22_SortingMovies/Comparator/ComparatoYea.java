package HW_Java.HW16_22_22_SortingMovies.Comparator;

import HW_Java.HW16_22_22_SortingMovies.Film;

import java.util.Comparator;

public class ComparatoYea implements Comparator<Film> {


    @Override
    public int compare(Film yea1, Film yea2) {
        return yea1.getYear()- yea2.getYear();
    }
}

