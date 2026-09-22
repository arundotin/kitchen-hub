package com.arun.kitchenhub.payment.api;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {



    public void completePayment(PaymentRequest paymentRequest) {
        System.out.println("Payment done for  >> "+paymentRequest.orderId());
    }
}
