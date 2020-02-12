package ca.sheridancollege.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.dao.DAO;

@WebServlet("/ViewAllDogs")
public class ViewAllDogs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Dog> list = new ArrayList();
		
		list = DAO.getDogs();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("viewall.jsp").forward(request, response);
		
	}

}
