package com.arun.kitchenhub.payment;

import org.springframework.modulith.ApplicationModuleInitializer;
import org.springframework.stereotype.Component;

@Component
public class PaymentInitializer implements ApplicationModuleInitializer {

    @Override
    public void initialize() {
        System.out.println("💳 Payment module initialized");
    }
}
