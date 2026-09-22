package com.arun.kitchenhub.order.internal;

public record OrderResponse(
    String id,
    String kitchenId,
    String item,
    OrderStatus status
) {
}
