package DesignPattern.Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);
        paymentProcessor.setPaymentStrategy(creditCard);
        paymentProcessor.processPayment();

    }
}
