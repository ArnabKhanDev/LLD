package DesignPattern.Creational.Factory.SimpleFactory;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType)
    {
        if(vehicleType.equals("Truck"))
            return new Truck();
        else if(vehicleType.equals("Bike"))
            return new Bike();
        throw new IllegalArgumentException();
    }
}
