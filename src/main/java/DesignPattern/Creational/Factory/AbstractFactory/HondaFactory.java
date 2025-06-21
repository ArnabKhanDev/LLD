package DesignPattern.Creational.Factory.AbstractFactory;

public class HondaFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
