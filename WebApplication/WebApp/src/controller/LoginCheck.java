package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDAO;
import model.Customer;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		try
		{
			String username=request.getParameter("username");
			String passwd=request.getParameter("password");
			
			Customer cust=new Customer();
			cust.setUsername(username);
			cust.setPasswd(passwd);
			
			RegisterDAO registerDAO=new RegisterDAO();
			Customer cust1=registerDAO.checkCredential(cust);
			
			out.println("User name: "+username);
			out.println("Password: "+passwd);
			
			
			if(cust1!=null)
			{
				request.setAttribute("username", cust1.getUsername());
				RequestDispatcher dispatch=request.getRequestDispatcher("UserHome.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo", "Error: User Does Not Exist");
				RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
				dispatch.forward(request, response);
			}
			
		}
		catch(Exception e)
		{
			request.setAttribute("errorInfo", "Error Occured While Logging In:  "+e.getMessage());
			RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
			dispatch.forward(request, response);
		}
	}

}
