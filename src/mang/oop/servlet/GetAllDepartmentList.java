package mang.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mang.oop.models.Dpartment;
import mang.oop.util.DepartmentDBUtil;

public class GetAllDepartmentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//calling function to get values to a object
			List<Dpartment> deptDetail = DepartmentDBUtil.getAllDepartmentlist();
			request.setAttribute("deptDetail",deptDetail);
			
			//redirect to the page with values to display
			RequestDispatcher dis = request.getRequestDispatcher("Department.jsp");
			dis.forward(request,response);
		
			}catch(Exception e) {
				e.printStackTrace();
			}

	}
	

}
