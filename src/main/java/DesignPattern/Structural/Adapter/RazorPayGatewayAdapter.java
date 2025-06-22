package DesignPattern.Structural.Adapter;

public class RazorPayGatewayAdapter implements PaymentGateway{

    RazorPayGateway razorPayGateway = new RazorPayGateway();
    @Override
    public Long payViaCC(Integer cardNumber, Integer cvv, Integer expiry) {
       String cardString = String.valueOf(cardNumber);
       String cvvString = String.valueOf(cvv);
       String expiryString = String.valueOf(expiry);
       String ans = razorPayGateway.payByCreditCard(cardString,cvvString,expiryString);
       return Long.valueOf(ans);
    }

    @Override
    public String getStatus(Long id) {
        return "Success";
    }
}
