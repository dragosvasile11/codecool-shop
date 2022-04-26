package com.codecool.shop.controller;

import com.codecool.shop.dao.implementation.OrderDaoMem;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/cart"})
public class CartController extends HttpServlet {
    OrderDaoMem orderDaoMem = OrderDaoMem.getInstance();
}
