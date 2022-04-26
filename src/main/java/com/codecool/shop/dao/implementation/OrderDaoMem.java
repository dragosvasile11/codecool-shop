package com.codecool.shop.dao.implementation;

import com.codecool.shop.model.CartItem;

import java.util.ArrayList;
import java.util.List;

public class OrderDaoMem {
    private String name;
    private String email;
    private String phoneNumber;
    private String billingAddress;
    private String shippingAddress;
    private boolean paymentAccepted;
    private List<CartItem> cartItems = new ArrayList<>();
    private static OrderDaoMem instance = null;
    private int totalPrice;

    private OrderDaoMem() {
    }

    public static OrderDaoMem getInstance() {
        if (instance == null) instance = new OrderDaoMem();
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public boolean isPaymentAccepted() {
        return paymentAccepted;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
