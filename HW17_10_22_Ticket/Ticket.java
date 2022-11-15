package HW_Java.HW17_10_22_Ticket;

import HW.HW17_10_22_Ticket.MyDateTime;
import HW.HW17_10_22_Ticket.Route;

public class Ticket {
    private MyDateTime time;
    private Route route;
    private double price;


    public Ticket(HW.HW17_10_22_Ticket.MyDateTime time, HW.HW17_10_22_Ticket.Route route, double price) {
        this.time = time;
        this.route = route;
        this.price = price;
    }

    public MyDateTime getTime() {
        return time;
    }

    public Route getRoute() {
        return route;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Ticket: " + time + '|' + " Price=" + price + "|" + route + '|';
    }

}