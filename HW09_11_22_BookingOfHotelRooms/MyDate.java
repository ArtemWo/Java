package HW_Java.HW09_11_22_BookingOfHotelRooms;

import HW_Java.HW09_11_22_BookingOfHotelRooms.HotelRooms.RoomPresident;

public class MyDate {
    private int begin;
    private String monthBegin;
    private int end;
    private String monthend;
    private int year;
    private int hour;
    private int min;
    private String fitnessCenter;

    public MyDate(int begin, String monthBegin, int end, String monthend, int year, int hour, int min, String fitnessCenter) {
        this.begin = begin;
        this.monthBegin = monthBegin;
        this.end = end;
        this.monthend = monthend;
        this.year = year;
        this.hour = hour;
        this.min = min;
        this.fitnessCenter = fitnessCenter;
    }

    public MyDate(int begin, String desember, int end, String desember1, int year, int hour, int min, String fitnessCenter, RoomPresident r4, MyDate myDate) {
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public String getMonthBegin() {
        return monthBegin;
    }

    public void setMonthBegin(String monthBegin) {
        this.monthBegin = monthBegin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getMonthend() {
        return monthend;
    }

    public void setMonthend(String monthend) {
        this.monthend = monthend;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getFitnessCenter() {
        return fitnessCenter;
    }

    public void setFitnessCenter(String fitnessCenter) {
        this.fitnessCenter = fitnessCenter;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "begin=" + begin +
                ", monthBegin='" + monthBegin + '\'' +
                ", end=" + end +
                ", monthend='" + monthend + '\'' +
                ", year=" + year +
                ", hour=" + hour +
                ", min=" + min +
                ", fitnessCenter='" + fitnessCenter + '\'' +
                '}';
    }
}