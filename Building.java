import java.util.Vector;

public class Building implements Room {
    Vector<Room> buildingComponents = new Vector<>();

    void addAnimal(Room animal){
        buildingComponents.add(animal);
    }
    @Override

    public void roomInfo() {
        System.out.println("Animal Class");
    }

    public void getSubordinates(){
        System.out.println();
        System.out.println("A Building consists of : ");

        for (Room element : buildingComponents) {
            element.roomInfo();
        }
        System.out.println();
    }
}

