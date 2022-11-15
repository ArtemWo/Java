package HW.HW17_10_22_Ticket;

public class Route {
    private int number;
    private String from;
    private String distantion;
    private long distance;

    public Route(int number, String from, String distantion, long distance) {
        this.number = number;
        this.from = from;
        this.distantion = distantion;
        this.distance = distance;
    }


    public int getNumber() {
        return number;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return '\n' + " Route=" + "Number: " + number + "| " + "From: " + from + "| " +
                "Distantion: " + distantion + "| " + "Distance=" + distance;
    }
}
