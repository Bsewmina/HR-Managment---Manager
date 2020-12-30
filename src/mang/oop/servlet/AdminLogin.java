package mang.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mang.oop.util.DepartmentDBUtil;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get login credentials
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//get function state sending values to the function
		boolean stat = DepartmentDBUtil.loginValidate(username,password);
		
		//redirect to the inside if values are available
		if(stat == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Department.jsp");
			dis.forward(request, response);
		}
		
		//else try again
		else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type='text/javascript'>");
			out.println("alert('Incorrect usernam or password !!!'); location ='AdminLogin.jsp'");
			out.println("</script>");
			
			
		}
	}

}
