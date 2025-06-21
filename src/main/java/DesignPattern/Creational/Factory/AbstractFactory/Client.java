package DesignPattern.Creational.Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        honda.stop();
    }
}
