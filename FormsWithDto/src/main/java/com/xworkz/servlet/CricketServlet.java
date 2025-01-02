package com.xworkz.servlet;

import com.xworkz.dto.CricketDto;
import com.xworkz.form.service.CricketService;
import com.xworkz.form.service.CricketServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/TournamentService", loadOnStartup = 1)
public class CricketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tournamentName = req.getParameter("tournamentName");
        String organizerName = req.getParameter("organizerName");
        String location = req.getParameter("location");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        int totalTeams = Integer.parseInt(req.getParameter("totalTeams"));
        long contactNumber =Long.parseLong(req.getParameter("contactNumber"));
        String email = req.getParameter("email");



        CricketDto cricketDto=new CricketDto(0,tournamentName,organizerName,location,startDate,endDate,totalTeams,contactNumber,email);
        CricketService service=new CricketServiceImpl();
        service.save(cricketDto);
        req.setAttribute("tournamentOrder", cricketDto);
        req.getRequestDispatcher("CricketTournamentFormResult.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CricketService service=new CricketServiceImpl();
        List<CricketDto> list=service.getAll();

        req.setAttribute("list",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("CricketResult.jsp");
        requestDispatcher.forward(req,resp);

    }
}
