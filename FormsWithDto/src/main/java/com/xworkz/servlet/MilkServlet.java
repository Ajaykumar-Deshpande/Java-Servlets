package com.xworkz.servlet;

import com.xworkz.dto.CricketDto;
import com.xworkz.dto.MilkDto;
import com.xworkz.form.service.MilkService;
import com.xworkz.form.service.MilkServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet(urlPatterns = "/milkform")
public class MilkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String brand=request.getParameter("brand");
        String type = request.getParameter("type");
        double quantity = Double.parseDouble(request.getParameter(("quantity")));
        String gettotal=request.getParameter("gettotal");

        Map<String, Double> priceMap = new HashMap<>();
        priceMap.put("special", 56.0);
        priceMap.put("ordinary", 54.0);
        priceMap.put("goodlife", 67.0);
        priceMap.put("goodlifeLite", 68.0);
        priceMap.put("family", 56.0);
        priceMap.put("buffalo", 70.0);
        Double price = priceMap.get(type);
        double total = price * quantity;
        MilkDto milkDto=new MilkDto(0,brand,type, (int) quantity,total);
        MilkService milkService=new MilkServiceImpl();
        milkService.save(milkDto);
        request.setAttribute("milkform",milkDto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("MilkForm.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MilkService  milkService=new MilkServiceImpl();
        System.out.println("hi");
        List<MilkDto> list=milkService.getALL();
        req.setAttribute("list",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("mikformResult.jsp");
        requestDispatcher.forward(req,resp);



    }
}
