package com.omarfr.ecommerce.kafka;

import com.omarfr.ecommerce.customer.CustomerResponse;
import com.omarfr.ecommerce.order.PaymentMethod;
import com.omarfr.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}