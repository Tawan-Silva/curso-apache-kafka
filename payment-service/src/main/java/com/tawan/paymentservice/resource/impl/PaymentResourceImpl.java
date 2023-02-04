package com.tawan.paymentservice.resource.impl;

import com.tawan.paymentservice.model.Payment;
import com.tawan.paymentservice.resource.PaymentResource;
import com.tawan.paymentservice.service.PaymentService;
import com.tawan.paymentservice.service.impl.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    private final PaymentService service;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        service.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
