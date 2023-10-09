import java.util.Vector;

public class LivingRoom implements Room {


    Vector<Room> livingAreaRooms = new Vector<>();

    void addRoom(Room newRoom) {
        livingAreaRooms.add(newRoom);
    }

    @Override
    public void roomInfo() {
        System.out.println("Living Room");
    }


    public void getSubordinates() {
        System.out.println();
        System.out.println("A Living Room consists of: ");

        for (Room element : livingAreaRooms) {
            element.roomInfo();
        }
        System.out.println();
    }
}

