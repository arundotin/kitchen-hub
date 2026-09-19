package com.arun.kitchenhub.kitchen;

public record KitchenResponse(
        String id,
        String name,
        String city,
        String cuisine,
        KitchenStatus status

) {
}
