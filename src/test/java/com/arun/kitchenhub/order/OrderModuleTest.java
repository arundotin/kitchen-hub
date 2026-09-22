package com.arun.kitchenhub.order;

import com.arun.kitchenhub.kitchen.KitchenService;
import com.arun.kitchenhub.payment.api.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@ApplicationModuleTest
public class OrderModuleTest {

    @MockitoBean
    KitchenService kitchenService;

    @MockitoBean
    PaymentService paymentService;


    @Test
    void loadsOrderModule() {
    }
}
