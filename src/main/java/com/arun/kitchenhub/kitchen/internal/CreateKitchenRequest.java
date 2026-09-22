package com.arun.kitchenhub.kitchen.internal;

public record CreateKitchenRequest(
        String name,
        String city,
        String cuisine
) {
}