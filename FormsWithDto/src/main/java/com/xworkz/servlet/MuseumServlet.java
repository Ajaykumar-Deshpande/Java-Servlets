package com.xworkz.servlet;

import com.xworkz.dto.MuseumDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        req.setAttribute("museumDto",museumDto);
        RequestDispatcher request=req.getRequestDispatcher("MuseumTicketForm.jsp");
        request.forward(req,resp);

    }
}