package HW.HW17_10_22_Ticket;

public class MyDateTime {
    private int day;
    private String month;
    private int year;
    private int hour;
    private int min;


    public MyDateTime(int day, String month, int year, int hour, int min) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {

        return month;
    }

    public int getYear() {

        return year;
    }

    public int getHour() {

        return hour;
    }

    public int getMin() {

        return min;
    }


    @Override
    public String toString() {
        return "My Date Time: " + "Day: " + day + "| " + "Month:" + month + "| " +
                "Year: " + year + "| " + "Hour: " + hour + "| " + " min: " + min;
    }
}




