package com.arun.kitchenhub.order.internal;

public record CreateOrderRequest(
        String kitchenId,
        String item
) {
}
