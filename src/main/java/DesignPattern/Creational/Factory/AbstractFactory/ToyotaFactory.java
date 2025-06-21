package DesignPattern.Creational.Factory.AbstractFactory;

public class ToyotaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
