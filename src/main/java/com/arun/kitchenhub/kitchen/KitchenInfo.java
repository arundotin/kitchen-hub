package com.arun.kitchenhub.kitchen;

/*
This is for the consumption of other modules
 */
public record KitchenInfo(
        String id,
        String name,
        String city,
        String cuisine
) {
}
