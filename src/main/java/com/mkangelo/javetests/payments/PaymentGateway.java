package com.mkangelo.javetests.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
