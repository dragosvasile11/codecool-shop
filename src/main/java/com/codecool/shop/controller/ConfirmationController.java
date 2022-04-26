package com.codecool.shop.controller;

import com.codecool.shop.config.TemplateEngineUtil;
import com.codecool.shop.dao.implementation.OrderDaoMem;
import com.google.gson.Gson;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet(urlPatterns = {"/confirmation"})
public class ConfirmationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(req.getServletContext());
        WebContext context = new WebContext(req, resp, req.getServletContext());
        OrderDaoMem orderDaoMem = OrderDaoMem.getInstance();
        context.setVariable("order", orderDaoMem);
        engine.process("/payment/confirmation.html", context, resp.getWriter());
        if (orderDaoMem.isPaymentAccepted()){
//            SendMail.sendOrderEmail(orderDaoMem.getEmail(),"Web shop Order","Your order is the following", orderDaoMem.getCartItems());
            Gson gson =  new Gson();
            String json = gson.toJson(orderDaoMem) + "\n" ;
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/logFiles/orders.txt",true));
            writer.write(json);
            writer.close();
            orderDaoMem.removeInstance();
        }
    }
}
