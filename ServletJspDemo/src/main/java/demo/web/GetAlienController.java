package demo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.web.demo.AlienDao;
import demo.web.model.Alien;






public class GetAlienController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		System.out.println(aid);
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		request.setAttribute("Alien", a1);
		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request,response);
		
		
	}
	

}