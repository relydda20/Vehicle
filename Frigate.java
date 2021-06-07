package Vehicle;

public class Frigate extends Vehicle implements seaVessel {
    public int displacement;

    public Frigate(String name, int maxPassengers, int maxSpeed, int displacement) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    public void launch() {
        System.out.println("Vehicle is now launching");
    }

    public void fireGun() {
        System.out.println("Vehicle is now firing");
    }
}