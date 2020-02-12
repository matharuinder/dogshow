package ca.sheridancollege.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.dao.DAO;

/**
 * Servlet implementation class ViewListByGroup
 */
@WebServlet("/ViewListByGroup")
public class ViewListByGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("hlist", DAO.viewList("Hounds"));
		request.setAttribute("slist", DAO.viewList("Sporting Dogs"));
		request.setAttribute("wlist", DAO.viewList("Working Dogs"));
		request.setAttribute("tlist", DAO.viewList("Terriers"));
		request.setAttribute("tylist", DAO.viewList("Toys"));
		request.setAttribute("nlist", DAO.viewList("Non-Sporting"));
		request.setAttribute("helist", DAO.viewList("Herding"));
		
		request.getRequestDispatcher("viewGrpList.jsp").forward(request, response);
	}

}
