package ca.sheridancollege.Servlets;

import ca.sheridancollege.dao.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SelectDays
 */
@WebServlet("/SelectDays")
public class SelectDays extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String fri = request.getParameter("fri");
		String sat = request.getParameter("sat");
		String sun = request.getParameter("sun");
		
		if(fri!=null) {
			DAO.selectFriday((int)(session.getAttribute("id")));
		}
		
		if(sat!=null) {
			DAO.selectSaturday((int)(session.getAttribute("id")));
		}
		
		if(sun!=null) {
			DAO.selectSunday((int)(session.getAttribute("id")));
		}
		
		response.sendRedirect("http://localhost:8080/Inderpreet_Matharu_Assignment1/default.jsp");
	}

}
