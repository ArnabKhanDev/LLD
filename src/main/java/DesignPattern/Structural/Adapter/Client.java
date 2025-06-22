package DesignPattern.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorPayGatewayAdapter());
        flipkart.makePaymentViaCC(123,22,2026);
    }
}
