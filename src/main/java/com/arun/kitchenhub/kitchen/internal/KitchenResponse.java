package com.arun.kitchenhub.kitchen.internal;

public record KitchenResponse(
        String id,
        String name,
        String city,
        String cuisine,
        KitchenStatus status

) {
}
