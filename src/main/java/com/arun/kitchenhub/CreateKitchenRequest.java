package com.arun.kitchenhub;

public record CreateKitchenRequest(
        String name,
        String city,
        String cuisine
) {
}