import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		PrintWriter out = res.getWriter();
//		out.println("Result is: "+k);
//		
//	}
//
//}

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		/* Cookie */
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		/* Session Management*/
		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
		
		/* Redirect method */
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		res.sendRedirect("sq?k="+k); //URL Rewriting
		
		
/* Example of Request Dispatcher using get method */
		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req,res);
		
		
	
//	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		PrintWriter out = res.getWriter();
//		out.println("Result is: "+k);
//		
	}

}
