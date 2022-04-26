package com.codecool.shop.model;

public class CartItem {
    private int id;
    private String name;
    private int piece;
    private int sumItemPrice;
    private int itemPrice;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPiece() {
        return piece;
    }

    public int getSumItemPrice() {
        return sumItemPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }
}
