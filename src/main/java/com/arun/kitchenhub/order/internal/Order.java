package com.arun.kitchenhub.order.internal;

public record Order(
    String id,
    String kitchenId,
    String item,
    OrderStatus status
) {
}
