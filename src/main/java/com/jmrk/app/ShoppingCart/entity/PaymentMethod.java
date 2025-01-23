package com.jmrk.app.ShoppingCart.entity;

import lombok.Getter;

@Getter
public enum PaymentMethod {
    CREDIT_CARD("Credit Card"),
    DEBIT_CARD("Debit Card"),
    PAYPAL("PayPal"),
    APPLE_PAY("Apple Pay"),
    GOOGLE_PAY("Google Pay"),
    BANK_TRANSFER("Bank Transfer"),
    CASH_ON_DELIVERY("Cash on Delivery"),
    GIFT_CARD("Gift Card"),
    BITCOIN("Bitcoin"),
    OTHER_CRYPTOCURRENCY("Other Cryptocurrency"),
    SQUARE("Square"),
    ADYEN("Adyen"),
    STRIPE("Stripe");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

}
