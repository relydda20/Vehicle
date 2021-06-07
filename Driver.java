package Vehicle;

import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
        Jeep Jeep = new Jeep("Jeep", 4, 195, 4);
        Hovercraft Hovercraft = new Hovercraft("Hovercraft", 4, 100, 4, 0);
        Frigate Frigate = new Frigate("Frigate", 200, 1000, 0);
        PoliceCar PoliceCar = new PoliceCar("Police Car", 4, 60, 4);

        Jeep.soundHorn();
        Jeep.drive();

        Hovercraft.drive();
        Hovercraft.launch();
        Hovercraft.enterLand();

        PoliceCar.drive();
        PoliceCar.soundSiren();
        PoliceCar.policeLights();

        Frigate.launch();
        Frigate.fireGun();

        ArrayList<PoliceCar> Vehicles = new ArrayList<>();

        Vehicles.add(PoliceCar);


    }
}
