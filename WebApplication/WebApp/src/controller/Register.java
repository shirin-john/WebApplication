package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.RegisterDAO;
import model.Customer;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try
		{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String username=request.getParameter("username");
		String passwd=request.getParameter("confirm");
		String address=request.getParameter("address");
		String pinCode=request.getParameter("pinCode");
		
		Customer cust=new Customer(name,email,gender,username,passwd,address,pinCode);
		
		RegisterDAO registerDAO=new RegisterDAO();
		
			if(registerDAO.registerCustomer(cust))
			{
				request.setAttribute("username", cust.getUsername());
				RequestDispatcher dispatch=request.getRequestDispatcher("UserHome.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo", "Error Occured During Registration");
				RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
				dispatch.forward(request, response);
			} 
		
		}
		catch(Exception e)
		{
			request.setAttribute("errorInfo", "Error Occured During Registration:  "+e.getMessage());
			RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
			dispatch.forward(request, response);
		}
		
		
	}

}
