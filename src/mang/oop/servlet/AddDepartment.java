package mang.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mang.oop.util.DepartmentDBUtil;


@WebServlet("/AddDepartment")
public class AddDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get parameters
		int ID = Integer.parseInt(request.getParameter("depID"));
		String title = (request.getParameter("depTitle"));
		String function = (request.getParameter("functions"));
		String location = (request.getParameter("location"));
		String managerID = (request.getParameter("depManagerID"));
		
		//calling function addDepartment by passing values
		boolean stat;
				stat = DepartmentDBUtil.addDepartment(ID,title,function,location,managerID);
		
		//display updated department if value added successfully
		if(stat == true){
			
			try {	
				
				//Display success message 
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type='text/javascript'>");
				out.println("alert('Department added successfully'); location ='Department.jsp'");
				out.println("</script>");
				
				
				}catch(Exception e) {
					e.printStackTrace(); //print error if error occurred
				}
		}
		//if failed display unsuccess message
			else{
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type='text/javascript'>");
				out.println("alert('Error adding department'); location ='Department.jsp'");
				out.println("</script>");
				
			}
			
		doGet(request, response);
	}

}
