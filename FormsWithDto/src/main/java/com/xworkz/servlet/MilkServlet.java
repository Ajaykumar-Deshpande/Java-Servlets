package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(urlPatterns = "/milkform")
public class MilkServlet extends HttpServlet {

    // Default constructor
    public MilkServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Getting parameters from the request
        String type = request.getParameter("type");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // Define the price map for different milk types
        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("special", 56.0);
        priceMap.put("ordinary", 54.0);
        priceMap.put("goodlife", 67.0);
        priceMap.put("goodlifeLite", 68.0);
        priceMap.put("family", 56.0);
        priceMap.put("buffalo", 70.0);

        // Calculate the price based on type
        Double price = priceMap.get(type);



        // Calculate total price
        double total = price * quantity;

        // Set attributes for forwarding to JSP
        request.setAttribute("gettotal", total);

        // Forward the request to the result JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/MilkForm.jsp");
        dispatcher.forward(request, response);
    }
}
