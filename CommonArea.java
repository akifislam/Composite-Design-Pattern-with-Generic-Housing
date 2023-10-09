import java.util.Vector;

public class CommonArea implements Room {

    Vector<Room> commonAreaRooms = new Vector<>();

    void addRoom(Room newRoom) {
        commonAreaRooms.add(newRoom);
    }

    @Override
    public void roomInfo() {
        System.out.println("Common Space");
    }

    public void getSubordinates() {
        System.out.println();
        System.out.println("Common space consists of :");

        for (Room element : commonAreaRooms) {
            element.roomInfo();
        }
        System.out.println();
    }
}
