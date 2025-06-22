package DesignPattern.Structural.Adapter;

public interface PaymentGateway {
    Long payViaCC(Integer cardNumber, Integer cvv, Integer expiry);
    String getStatus(Long id);
}
