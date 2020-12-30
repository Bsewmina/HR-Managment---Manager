package mang.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mang.oop.models.Dpartment;
import mang.oop.util.DepartmentDBUtil;

@WebServlet("/GetDepartment")
public class GetDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get department id
		Integer id = Integer.parseInt(request.getParameter("depID"));
		
		try {
			//call getDepartmentlist function passing id
			List<Dpartment> deptDetail = DepartmentDBUtil.getDepartmentlist(id);
			request.setAttribute("deptDetail",deptDetail);
			
			//redirect to department.jsp page with list object
			RequestDispatcher dis = request.getRequestDispatcher("Department.jsp");
			dis.forward(request,response);
		
			}catch(Exception e) {
				e.printStackTrace();
			}

	}
}
