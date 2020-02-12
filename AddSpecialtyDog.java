package ca.sheridancollege.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.Logic.SendEmail;
import ca.sheridancollege.dao.DAO;

/**
 * Servlet implementation class AddSpecialtyDog
 */
@WebServlet("/addSpecialtyDog")
public class AddSpecialtyDog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		String owner = request.getParameter("owner");
		String breed = request.getParameter("breed");
		String group = request.getParameter("group");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		Dog d = new Dog();
		d.setType("Specialty");
		d.setName(name);
		d.setBreed(breed);
		d.setGender(gender);
		d.setGroup(group);
		d.setOwnerName(owner);
		
		DAO.addDog(d);
		
		
		session.setAttribute("id", DAO.getLastDog().getId());
		
		SendEmail.main(new String []{});
		
		//response.sendRedirect("http://localhost:8080/Inderpreet_Matharu_Assignment1/default.jsp");
		
		request.getRequestDispatcher("./selectDays.jsp").forward(request, response);
		
	}

}
