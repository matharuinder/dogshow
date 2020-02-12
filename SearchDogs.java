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

@WebServlet("/Search")
public class SearchDogs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Dog> list = new ArrayList();
		
		if(request.getParameter("id")!=null) {
			list = DAO.searchById(request.getParameter("id"));
		}
		if(request.getParameter("name")!=null) {
			list = DAO.searchByName(request.getParameter("name"));
		}
		if(request.getParameter("owner")!=null) {
			list = DAO.searchByOwner(request.getParameter("owner"));
		}
		if(request.getParameter("breed")!=null) {
			list = DAO.searchByBreed(request.getParameter("breed"));
		}
		if(request.getParameter("group")!=null) {
			list = DAO.searchByGroup(request.getParameter("group"));
		}
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("search.jsp").forward(request, response);
		
	}

}
