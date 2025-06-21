package DesignPattern.Creational.Factory.AbstractFactory;

public class Toyota implements Vehicle {
    @Override
    public void start() {
        System.out.println("Toyota starts");
    }

    @Override
    public void stop() {
        System.out.println("Toyota stops");
    }
}
