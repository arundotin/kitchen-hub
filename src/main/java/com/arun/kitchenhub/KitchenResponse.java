package com.arun.kitchenhub;

public record KitchenResponse(
        String id,
        String name,
        String city,
        String cuisine,
        KitchenStatus status

) {
}
