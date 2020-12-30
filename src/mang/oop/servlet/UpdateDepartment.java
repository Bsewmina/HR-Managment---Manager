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

@WebServlet("/UpdateDepartment")
public class UpdateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get updating data 
		int ID = Integer.parseInt(request.getParameter("depID"));
		String title = (request.getParameter("depTitle"));
		String function = (request.getParameter("functions"));
		String location = (request.getParameter("location"));
		String managerID = (request.getParameter("depManagerID"));
		
		//set function status to boolean value
		 boolean stat = DepartmentDBUtil.updateDepartment(ID,title,function,location,managerID);
	
		 //display updated values if updated correctly
	if(stat == true){
	try {
		
		List<Dpartment> deptDetail = DepartmentDBUtil.getDepartmentlist(ID);
		request.setAttribute("deptDetail",deptDetail);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("Department.jsp");
		dis.forward(request,response);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//else redirect to AddDpartmentpage
	else{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<script type='text/javascript'>");
		out.println("alert('Error updating the department'); location ='Department.jsp'");
		out.println("</script>");
	}

		
	}

}
