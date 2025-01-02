package com.xworkz.servlet;

import com.xworkz.dto.MuseumDto;
import com.xworkz.form.service.MuseumService;
import com.xworkz.form.service.MuseumServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/send")
public class MuseumServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName=req.getParameter("customerName");
        int numOfAdults =Integer.parseInt(req.getParameter("numOfAdults"));
        int numOfChildren=Integer.parseInt(req.getParameter("numOfChildren"));
        long mobileNumber=Long.parseLong(req.getParameter("mobileNumber"));
        String email=req.getParameter("email");

        MuseumDto museumDto=new MuseumDto(customerName,numOfAdults,numOfChildren,mobileNumber,email);
        int totalCost=(numOfAdults*100)+(numOfChildren*50);

        req.setAttribute("totalCost",totalCost);
        req.setAttribute("customerName",customerName);
        req.setAttribute("numOfAdults",numOfAdults);
        req.setAttribute("numOfChildren",numOfChildren);
        req.setAttribute("email",email);

        MuseumService museumService = new MuseumServiceImpl();
        boolean result = museumService.save(museumDto);
        if (result ==true)
        {
            req.setAttribute("message",customerName+ "  and thier adults museum cost is  "+numOfAdults+ "   and their childrens museum cost is  " +numOfChildren+ "  mobile number  " +mobileNumber+ " and email id   " +email );

        }else {
            req.setAttribute("message","not saved");
        }


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("MuseumTicketForm.jsp");
        requestDispatcher.forward(req, resp);

        System.out.println("Successfully Register...");


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MuseumService museumService=new MuseumServiceImpl();
        List<MuseumDto> list=museumService.getAll();

        req.setAttribute("list",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("museumResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}