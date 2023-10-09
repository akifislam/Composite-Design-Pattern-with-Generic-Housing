import java.util.Vector;

public class Appartment implements Room {

    Vector<Room> components = new Vector<>();

    void addRoom(Room newRoom) {
        components.add(newRoom);
    }

    @Override
    public void roomInfo() {
        System.out.println();
        System.out.println("An appartment is built with: ");

        for (Room element : components) {
            element.roomInfo();
        }
        System.out.println();
    }
}
