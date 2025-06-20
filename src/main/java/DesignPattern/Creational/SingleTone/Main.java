package DesignPattern.Creational.SingleTone;

public class Main {
    public static void main(String[] args) {
        SingleTone instance1 = SingleTone.getInstance();
        SingleTone instance2 = SingleTone.getInstance();
        SingleTone instance3 = SingleTone.getInstance();
    }
}
