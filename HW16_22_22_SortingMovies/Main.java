package HW_Java.HW16_22_22_SortingMovies;

import HW_Java.HW16_22_22_SortingMovies.Comparator.ComparatoYea;
import HW_Java.HW16_22_22_SortingMovies.Comparator.ComparatorMoviaGener;
import HW_Java.HW16_22_22_SortingMovies.Comparator.ComparatorMoviaRating;
import HW_Java.HW16_22_22_SortingMovies.Comparator.ComparatorMovieTitle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  /*  todo    1.      В классе MyDate задать натуральны порядок дат, т.е. реализовать интерфейс
        Comparable. При этом пусть считается, что 01.01.2020 < 01.01.2022, т.е. дата тем больше,
        чем более поздний момент она отражает.
        2.      Создать класс Film и полями: название, жанр, рейтинг, год; Создать список фильмов.
                Программа должна спрашивать, какая сортировка нужна пользователю (по названию,
                по рейтингу, по жанру или году) и выводить отсортированный список на экран.*/
        Scanner console = new Scanner(System.in);
        System.out.println("------------Enter movie sorting--------------");
        String input = console.nextLine();
        Film film1 = new Film("The Intouchables", 9, "comedy", 2011);
        Film film2 = new Film("Two is a Family", 10, "drama", 2016);
        Film film3 = new Film("Ford vs Ferrari", 7, "comedy", 2019);
        Film film4 = new Film("Ride Like a Girl", 3, "drama", 2020);


        Film[] films = {film1, film2, film3, film4};
        System.out.println("=============== sort by movie title ===============");
               Arrays.sort(films, new ComparatorMovieTitle());
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i].toString());
        }
        System.out.println("=============== sort by movie rating ===============");
        Arrays.sort(films, new ComparatorMoviaRating());
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i].toString());
        }
        System.out.println("=============== sort by movie genre ===============");
        Arrays.sort(films, new ComparatorMoviaGener());
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i].toString());
        }
        System.out.println("=============== sort by the year of the movie ===============");
        Arrays.sort(films, new ComparatoYea());
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i].toString());
        }
    }
}
