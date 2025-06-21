package DesignPattern.Creational.Factory.AbstractFactory;

public class Honda implements Vehicle {
    @Override
    public void start() {
        System.out.println("Honda starts");
    }

    @Override
    public void stop() {
        System.out.println("Honda stops");
    }
}
