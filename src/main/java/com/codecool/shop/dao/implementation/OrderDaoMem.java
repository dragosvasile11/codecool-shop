package com.codecool.shop.dao.implementation;

import java.util.ArrayList;

public class OrderDaoMem {
    private String name;
    private String email;
    private String phoneNumber;
    private String billingAddress;
    private String shippingAddress;
    private boolean paymentSucceeded;
    private List<cartItem> cartItems = new ArrayList<>();
    private static OrderDaoMem instance = null;
    private int totalPrice;
}
