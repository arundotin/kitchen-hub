package com.arun.kitchenhub.kitchen;

public record CreateKitchenRequest(
        String name,
        String city,
        String cuisine
) {
}