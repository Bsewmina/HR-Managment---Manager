package mang.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mang.oop.util.DepartmentDBUtil;


@WebServlet("/UpdateNotice")
public class UpdateNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get neccesory information
		String name = request.getParameter("notice-name");
		String title = request.getParameter("noticeTitle");
		String content = request.getParameter("content");
		
		//calling function to update the notice
		boolean status = DepartmentDBUtil.updateNotice(name, title,content);
		
		//display message of succeed
		if(status == true) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type='text/javascript'>");
			out.println("alert('update success'); location ='ManageNotice.jsp'");
			out.println("</script>");
		}
		
		//else display a message
		else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type='text/javascript'>");
			out.println("alert('Error upload failed !!!');");
			out.println("</script>");
		}
	
	}

}
