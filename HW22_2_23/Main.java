package org.example.HW22_2_23;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
/*   todo:1) Составить список времен начала всех занятий по Java на февраль,
            если предположить, что они проходят каждый понедельник/среду c 9:30 CET. */
        System.out.println("Example 1  -------------------------------");
        LocalDate startDay = LocalDate.of(2023, 2, 1);
        LocalTime timeLessons = LocalTime.of(9, 30);
        LocalDate endDay = LocalDate.of(2023, 2, 28);
        TemporalAdjuster monday = TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY);
        TemporalAdjuster wednesday = TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY);
          LocalDate e = startDay.with(monday);
        System.out.println("MONDAY  --  " + timeLessons);
        e.datesUntil(endDay, Period.ofDays(7)).forEach(System.out::println);
          LocalDate e2 = startDay.with(wednesday);
        System.out.println("WEDNESDAY  --  " + timeLessons);
        e2.datesUntil(endDay, Period.ofDays(7)).forEach(System.out::println);


        System.out.println("Example 2  -------------------------------");
 /*todo: 2) Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени
        и длится 10 ч. 50 м. Во сколько он прилетит? Написать метод, который мог бы совершать
        подобные вычисления.*/
        LocalDateTime departureDataTime = LocalDateTime.of(2023, 4, 22, 15, 5);
        int durationInHour = 10;
        int durationInMinutes = 50;
        LocalTime calculatingArrivalTime = calculateTime(departureDataTime, durationInHour, durationInMinutes);
         System.out.println(calculatingArrivalTime);

    }

    // //Example 2
    public static LocalTime calculateTime(LocalDateTime departureDataTime, int durationInHour, int durationInMinutes) {
        LocalTime flightDurationTime = LocalTime.from(departureDataTime.plusHours(durationInHour).plusMinutes(durationInMinutes));
        return flightDurationTime;
    }
}
