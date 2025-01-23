package com.jmrk.app.ShoppingCart.entity;

import lombok.Getter;

@Getter
public enum ShippingMethod {
    STANDARD("Standard"),         // Standard delivery (default, typically slower but cheaper)
    EXPRESS("Express"),          // Faster delivery option
    OVERNIGHT("Overnight"),        // Delivery by the next day
    SAME_DAY("Same day"),         // Delivery on the same day
    INTERNATIONAL("International"),    // For shipments outside the country
    PICKUP("Pickup"),           // Customer picks up the order from the store/warehouse
    DRONE_DELIVERY("Drone delivery");    // High-tech delivery options like drones

    private final String displayName;

    ShippingMethod(String displayName) {
        this.displayName = displayName;
    }
}
