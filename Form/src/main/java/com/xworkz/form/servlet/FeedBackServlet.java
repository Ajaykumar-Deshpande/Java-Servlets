package com.xworkz.form.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.FeedBackDTO;
import com.xworkz.form.service.FeedBackService;
import com.xworkz.form.service.FeedBackServiceImpl;

public class FeedBackServlet extends HttpServlet {

	public FeedBackServlet() {

		System.out.println("no arg const of FeedBackServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String comments = req.getParameter("comments");

		FeedBackDTO feedBackDTO = new FeedBackDTO(name, email, comments);
		System.out.println("FeedBack DTO:" + feedBackDTO);
		resp.getWriter().println(feedBackDTO);

		FeedBackService feedBackService = new FeedBackServiceImpl();
		boolean isValid = feedBackService.validateAndSave(feedBackDTO);

		if (isValid) {
			System.out.println("Feed Back success");
		} else {
			System.out.println("Feed Back failed");
		}
		req.setAttribute("name", name);
		req.getRequestDispatcher("/Feedback.jsp").forward(req, resp);

	}
}
