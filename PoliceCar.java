package Vehicle ;

public class PoliceCar extends Vehicle implements IsEmergency, IsLandVehicle{
    int numWheels;

    public PoliceCar (String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("Vehicle is now in motion");
    }
    public void soundSiren() {
        System.out.println("Vehicle is now sounding its siren");
    }

    public void policeLights() {
        System.out.println("Police lights are now turned on");
    }
}
