package tw.brad.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad15")
public class Brad15 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("Brad16?name=Brad&status=OK");
		
		RequestDispatcher dispatcher2 = 
				request.getRequestDispatcher("Brad17");

		out.println("<h1>Brad Big Company</h1>");
		out.println("<hr/>");
		
		// include
		dispatcher.include(request, response);
		out.println("<hr />");
		dispatcher2.include(request, response);
		
		out.println("<hr />");
		out.println("Copyleft");
		
		
		
		
	}
}
