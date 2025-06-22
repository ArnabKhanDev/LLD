package DesignPattern.Structural.Adapter;

public class Flipkart {
    private PaymentGateway paymentGateway;

    Flipkart(PaymentGateway paymentGateway)
    {
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(Integer cardNumber, Integer cvv, Integer expiry)
    {
        Long tid = paymentGateway.payViaCC(cardNumber,cvv,expiry);
        while(!paymentGateway.getStatus(tid).equals("Success"))
            System.out.println("Waiting");
    }

}

