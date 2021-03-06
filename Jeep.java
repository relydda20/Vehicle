package Vehicle;

public class Jeep extends Vehicle implements IsLandVehicle {
    public int numWheels;

    public Jeep (String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }


    public void soundHorn() {
        System.out.println("Beep beep");
    }

    public void drive(){
        System.out.println("Vehicle is now in motion");
    }

}
