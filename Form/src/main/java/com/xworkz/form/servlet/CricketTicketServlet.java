package com.xworkz.form.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.CricketTicketDTO;
import com.xworkz.form.service.CricketTicketService;
import com.xworkz.form.service.CricketTicketServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cricket")

public class CricketTicketServlet extends HttpServlet {

	public CricketTicketServlet() {

		System.out.println("no arg const of CricketTicketServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String groundName = req.getParameter("groundName");
		String customerName = req.getParameter("customerName");
		String customerEmail = req.getParameter("customerEmail");
		String seatType = req.getParameter("seatType");
		String numberOfTickets = req.getParameter("numberOfTickets");
		int convetedNumberOfTickets = Integer.valueOf(numberOfTickets);

		CricketTicketDTO cricketTicketDTO = new CricketTicketDTO(groundName, customerName, customerEmail, seatType,
				convetedNumberOfTickets);

		System.out.println("CricketTicketDTO:" + cricketTicketDTO);
		resp.getWriter().println(cricketTicketDTO);

		CricketTicketService cricketTicketService = new CricketTicketServiceImpl();
		boolean isValid = cricketTicketService.validateAndSave(cricketTicketDTO);

		if (isValid) {
			System.out.println("Booking fail");
		} else {
			System.out.println("Booking success");
		}
	}

}
