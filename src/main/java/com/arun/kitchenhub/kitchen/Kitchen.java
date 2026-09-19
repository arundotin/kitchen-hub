package com.arun.kitchenhub.kitchen;

public record Kitchen(
        String id,
        String name,
        String city,
        String cuisine,
        KitchenStatus status
) {
}
