package mang.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mang.oop.models.Dpartment;
import mang.oop.util.DepartmentDBUtil;


@WebServlet("/DeleteDepartment")
public class DeleteDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("removDid"));
		
		//status of the function
		boolean status = DepartmentDBUtil.deleteDepartment(id);
		
		//if successfully added display an alert message
		if(status == true) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type='text/javascript'>");
			out.println("alert('Department successfully deleted !'); location ='Department.jsp'");
			out.println("</script>");
			
		}
		
		//if unsuccess display alert message
		else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type='text/javascript'>");
			out.println("alert('Error unable to delete selected ID'); location ='Department.jsp'");
			out.println("</script>");
		}
		
	}

}
