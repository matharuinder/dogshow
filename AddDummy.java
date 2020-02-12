package ca.sheridancollege.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.dao.DAO;

/**
 * Servlet implementation class AddDummy
 */
@WebServlet("/AddDummy")
public class AddDummy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAO.addDummyRecords();
		
		response.sendRedirect("http://localhost:8080/Inderpreet_Matharu_Assignment1/index.jsp");
		
	}

}
