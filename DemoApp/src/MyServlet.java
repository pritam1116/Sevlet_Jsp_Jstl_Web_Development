import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	/* ServletConfig & ServletContext */
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("Hi<br>");
		
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("Name");
		out.println(str);
//		PrintWriter out = response.getWriter();
//		out.print("Hi<br>");
//		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("Name");
//		out.println(str);
	}

}
