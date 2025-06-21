package DesignPattern.Creational.Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Truck");
        vehicle.start();
        vehicle.stop();
    }
}
