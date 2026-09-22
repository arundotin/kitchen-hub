package com.arun.kitchenhub.kitchen.internal;

public record Kitchen(
        String id,
        String name,
        String city,
        String cuisine,
        KitchenStatus status
) {
}
