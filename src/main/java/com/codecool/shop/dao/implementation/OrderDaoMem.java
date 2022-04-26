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
    private boolean paymentSucceeded;
    private List<CartItem> cartItems = new ArrayList<>();
    private static OrderDaoMem instance = null;
    private int totalPrice;

    private OrderDaoMem() {
    }

    public static OrderDaoMem getInstance() {
        if (instance == null) instance = new OrderDaoMem();
        return instance;
    }
}
