package Vehicle;

public class Hovercraft extends Vehicle implements IsLandVehicle,seaVessel {
    public int numWheels;
    public int displacement;

    public Hovercraft(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        this.displacement = displacement;

    }

    public void drive() {
        System.out.println("Vehicle is now in motion");
    }

    public void launch() {
        System.out.println("Vehicle is now launching");
    }

    public void enterLand(){
        System.out.println("Vehicle is now entering land");
    }

    public void enterSea(){
        System.out.println("Vehicle is now entering sea");
    }
}