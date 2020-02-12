package ca.sheridancollege.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.dao.DAO;


public class DHandC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session = request.getSession();
		
		String userRole = request.getUserPrincipal().getName();
		
		String name = request.getParameter("name");
		String owner = request.getParameter("owner");
		String breed = request.getParameter("breed");
		String group = request.getParameter("group");
		String gender = request.getParameter("gender");
		
		Dog d = new Dog();
		d.setType("Class");
		d.setName(name);
		d.setBreed(breed);
		d.setGender(gender);
		d.setGroup(group);
		d.setOwnerName(owner);
		
		DAO.addDog(d);
		
		session.setAttribute("id", DAO.getLastDog().getId());
		
		DAO.addDogToHList(d,userRole);
		
		//session.setAttribute("id", DAO.getLastDog().getId());
		
		//response.sendRedirect("http://localhost:8080/Inderpreet_Matharu_Assignment1/dogHandlers/test");
		
		request.getRequestDispatcher("dogHandlers/selectDays").forward(request, response);
		
	}

}
