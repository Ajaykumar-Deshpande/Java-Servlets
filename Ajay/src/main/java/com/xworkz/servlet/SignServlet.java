package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.ServiceDto;
import com.xworkz.service.Service;
import com.xworkz.service.ServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/login")
public class SignServlet extends HttpServlet {
	public SignServlet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String conformPassword=req.getParameter("confirmpassword");
		ServiceDto signupDTO=new ServiceDto(user, email, password, conformPassword);
		
		Service imp=new ServiceImpl();
		boolean isvalid= imp.valid(signupDTO);
		
		if(isvalid) {
			req.setAttribute("success",user+" your signup completed");
		}
		else {
			req.setAttribute("failure",user+" your signup failure");
		}
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("Signup.jsp");
		requestDispatcher.forward(req,resp);
	}

}