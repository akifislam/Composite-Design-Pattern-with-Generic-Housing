public class CompositePatternDemo {
    public static void main(String[] args) {

        // Creating Leaf Node : Bathroom, Kitchen and Bedroom
        Bathroom bathroom = new Bathroom();
        Kitchen kitchen = new Kitchen();
        Bedroom bedroom = new Bedroom();

        // Sending Bathroom, Kitchen, Bedroom to its Composite Class ---> Living Room
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.addRoom(bathroom);
        livingRoom.addRoom(kitchen);
        livingRoom.addRoom(bedroom);
        livingRoom.getSubordinates();

        // Creating Leaf Node : Elevator, Staircase and Swimming Pool
        Elevator elevator = new Elevator();
        Staircase staircase = new Staircase();
        SwimmingPool swimmingPool = new SwimmingPool();

        // Sending Elevator, Staircase, Swimming Pool to its Composite Class ---> Common Area
        CommonArea commonArea = new CommonArea();
        commonArea.addRoom(elevator);
        commonArea.addRoom(staircase);
        commonArea.addRoom(swimmingPool);
        commonArea.getSubordinates();

        Appartment appartment = new Appartment();
        appartment.addRoom(commonArea);
        appartment.addRoom(livingRoom);
        appartment.roomInfo();
    }
}
