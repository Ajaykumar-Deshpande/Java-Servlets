package com.xworkz.productform.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.productform.Dto.ProductDto;
import com.xworkz.productform.service.Product;
import com.xworkz.productform.service.ProductImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
	public ProductServlet() {
		System.out.println("createt ProductServlet const ");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String companyName = arg0.getParameter("companyName");
		String productName = arg0.getParameter("productName");
		String productType = arg0.getParameter("type");
		String productQuantiy = arg0.getParameter("productQuantiy");
		String productCost = arg0.getParameter("productCost");

		int convertedProductQuantiy = Integer.valueOf(productQuantiy);
		double convertedProductCost = Double.valueOf(productCost);

		ProductDto productDTO = new ProductDto(companyName, productName, productType, convertedProductQuantiy,
				convertedProductCost);

		Product productService = new ProductImpl();
		boolean isValid = productService.isValidAndSave(productDTO);
		double total = convertedProductQuantiy * convertedProductCost;
		if (isValid) {
			System.out.println("data is valid");
			arg0.setAttribute("success", productName + "  and total is " + total);
		} else {
			System.out.println("data is not valid");
			arg0.setAttribute("failure", "validationError");
			arg0.setAttribute("dto", productDTO);
		}

		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("product.jsp");
		requestDispatcher.forward(arg0, arg1);
	}
}
