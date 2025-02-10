package com.omarfr.ecommerce.payment;

import com.omarfr.ecommerce.customer.CustomerResponse;
import com.omarfr.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}