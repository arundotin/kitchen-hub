package com.arun.kitchenhub.kitchen;

import org.springframework.modulith.ApplicationModuleInitializer;
import org.springframework.stereotype.Component;

@Component
public class KitchenInitializer implements ApplicationModuleInitializer {
    @Override
    public void initialize() {
        System.out.println("🔥 Kitchen module initialized");
    }
}
