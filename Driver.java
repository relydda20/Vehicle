package Vehicle;

public class Driver {
    public static void main(String args[]) {
        Vehicle myArray[] = {new Jeep("Jeep", 4, 195, 4),
                new Hovercraft("Hovercraft", 4, 100, 4, 0),
                new Frigate("Frigate", 200, 1000, 0),
                new PoliceCar("Police Car", 4, 60, 4),};

        Jeep.soundHorn();

        Jeep.drive();


    }
}
