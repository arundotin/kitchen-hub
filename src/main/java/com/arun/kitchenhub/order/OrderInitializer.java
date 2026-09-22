package com.arun.kitchenhub.order;

import org.springframework.modulith.ApplicationModuleInitializer;
import org.springframework.stereotype.Component;

@Component
public class OrderInitializer implements ApplicationModuleInitializer {

    @Override
    public void initialize() {
        System.out.println("🟢 Order module initialized");
    }
}
