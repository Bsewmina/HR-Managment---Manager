package mang.oop.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mang.oop.models.Notice;
import mang.oop.util.DepartmentDBUtil;


@WebServlet("/GetNotice")
public class GetNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			ArrayList<Notice> status = DepartmentDBUtil.getNotice();
			request.setAttribute("status",status);
			
			RequestDispatcher dis = request.getRequestDispatcher("NoticePage.jsp");
			dis.forward(request,response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
