package com.xworkz.servlet;

import com.xworkz.dto.SweetDto;
import com.xworkz.form.service.SweetService;
import com.xworkz.form.service.SweetServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(urlPatterns = "/sweet" )
public class SweetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String special = request.getParameter("Special");
        String ShopName = request.getParameter("ShopName");
        String SweetName = request.getParameter("SweetName");
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
        request.setAttribute("ShopName","ShopName is : "+ShopName);
        request.setAttribute("SweetName","SweetName is : "+SweetName);
        request.setAttribute("quantity","quantity is : "+quantity);

        RequestDispatcher dispatcher = request.getRequestDispatcher("SweetForm.jsp");
        dispatcher.forward(request,response);

        SweetDto sweetDto=new SweetDto(ShopName,SweetName,special,quantity);
        SweetService sweetService=new SweetServiceImpl();
        System.out.println("servlet : "+sweetDto);
        sweetService.save(sweetDto);



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SweetService sweetService=new SweetServiceImpl();
        List<SweetDto> list=sweetService.getAll();

        req.setAttribute("list",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("sweetResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}


