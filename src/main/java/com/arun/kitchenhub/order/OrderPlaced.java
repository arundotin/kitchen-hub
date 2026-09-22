package com.arun.kitchenhub.order;

public record OrderPlaced(
        String orderId,
        String kitchenId,
        String item
) {
}