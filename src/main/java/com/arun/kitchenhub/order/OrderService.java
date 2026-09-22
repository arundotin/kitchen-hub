package com.arun.kitchenhub.order;

import com.arun.kitchenhub.kitchen.KitchenInfo;
import com.arun.kitchenhub.kitchen.KitchenService;
import com.arun.kitchenhub.order.internal.CreateOrderRequest;
import com.arun.kitchenhub.order.internal.OrderResponse;
import com.arun.kitchenhub.order.internal.OrderStatus;
import com.arun.kitchenhub.payment.api.PaymentRequest;
import com.arun.kitchenhub.payment.api.PaymentService;
import com.github.f4b6a3.ulid.UlidCreator;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private KitchenService kitchenService;
    private PaymentService paymentService;

    public OrderService(KitchenService kitchenService, PaymentService paymentService) {
        this.kitchenService = kitchenService;
        this.paymentService = paymentService;
    }

    public OrderResponse createOrder(CreateOrderRequest createOrderRequest) {

        KitchenInfo kitchenInfo = kitchenService
                .getKitchenInfo(createOrderRequest.kitchenId())
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Kitchen not found: " + createOrderRequest.kitchenId()
                        )
                );

        String orderId = UlidCreator.getUlid().toString();

        // call paymentService

        paymentService.completePayment(new PaymentRequest(
                orderId
        )) ;



        return new OrderResponse(
                orderId,
                kitchenInfo.id(),
                createOrderRequest.item(),
                OrderStatus.PLACED
        );
    }
}
