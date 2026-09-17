package com.arun.kitchenhub;

public record Kitchen(
        String id,
        String name,
        String city,
        String cuisine,
        KitchenStatus status
) {
}
