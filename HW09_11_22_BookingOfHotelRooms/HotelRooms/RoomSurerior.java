package HW_Java.HW09_11_22_BookingOfHotelRooms.HotelRooms;

public class RoomSurerior extends Rooms{
    public RoomSurerior(int nuberRoom){
        super(nuberRoom);

    }

    @Override
    public double getPrice() {
        return 1000;
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.SUPERIOR;
    }

    @Override
    public String fitnessCenter() {
        return "included in the price";
    }

    @Override
    public String toString() {
        return "RoomSurerior{} " + super.toString();
    }
}
