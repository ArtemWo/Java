package HW_Java.HW09_11_22_BookingOfHotelRooms.HotelRooms;

import HW_Java.HW09_11_22_BookingOfHotelRooms.MyDate;

public abstract class Rooms {
    private int nuberRoom;

    public Rooms(int nuberRoom) {
        this.nuberRoom = nuberRoom;
    }

    public Rooms() {
        Rooms[] roomsArrys;
    }

    public Rooms(RoomStandart r1, MyDate myDate) {
    }

    public abstract double getPrice();
    public abstract RoomType getRoomType();
    public abstract String  fitnessCenter();

    @Override
    public String toString() {
        return "Rooms{" +
                "nuberRoom=" + nuberRoom +
                '}';
    }
}
