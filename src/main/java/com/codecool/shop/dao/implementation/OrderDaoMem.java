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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setPaymentAccepted(boolean paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
