package com.tawan.paymentservice.service;

import com.tawan.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
