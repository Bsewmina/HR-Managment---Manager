package mang.oop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mang.oop.util.DepartmentDBUtil;


@WebServlet("/AddNotice")
public class AddNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//get notice details 
		String name = request.getParameter("notice-name");
		String title = request.getParameter("noticeTitle");
		String content = request.getParameter("content");
		
		//call addnotice function to add values
			boolean status = DepartmentDBUtil.addNotice(name, title,content);
			
			//if successfully added display a message
			if(status == true) {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type='text/javascript'>");
				out.println("alert('Notice upload successful'); location ='Department.jsp'");
				out.println("</script>");
			}
			
			//else another message
			else {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type='text/javascript'>");
				out.println("alert('Notice upload failed !!! '); location ='AddNotice.jsp'");
				out.println("</script>");
			}
			
		}
		
	

}
