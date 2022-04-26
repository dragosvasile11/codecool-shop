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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public void setSumItemPrice(int sumItemPrice) {
        this.sumItemPrice = sumItemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
