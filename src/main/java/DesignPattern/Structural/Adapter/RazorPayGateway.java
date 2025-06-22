package DesignPattern.Structural.Adapter;

public class RazorPayGateway {
    String payByCreditCard(String cardNumber, String cvv, String expiry){
        System.out.println("Payment done by Razorpay");
        return "123";
    }
    String paymentStatus(String id){
        return "Success";
    }
}
