package HW_Java.HW09_11_22_BookingOfHotelRooms.HotelRooms;

public class RoomStandart extends Rooms {
    public RoomStandart(int nuberRoom) {
        super(nuberRoom);
    }

    @Override
    public double getPrice() {
        return 1000;
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.STANDARD ;
    }

    @Override
    public String fitnessCenter() {
        return "included in the price";
    }

    @Override
    public String toString() {
        return "RoomStandart{} " + super.toString();
    }
}