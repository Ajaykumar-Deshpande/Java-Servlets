package com.xworkz.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet")
public class SweetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String special = request.getParameter("Special");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        System.out.println(special);
        double sweetPrice=300;
        if(special==null){
            sweetPrice=sweetPrice*quantity;

        }
        else{
            sweetPrice=(sweetPrice*quantity)+30;
        }

        request.setAttribute("sweetPrice","Sweet Price is : "+sweetPrice);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/SweetForm.jsp");
    dispatcher.forward(request, response);
    }
}


