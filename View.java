package ca.sheridancollege.customtags;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.dao.DAO;



public class View extends SimpleTagSupport {
	
	private ArrayList<Dog> list;
	
	



	public void setList(ArrayList<Dog> list) {
		this.list = list;
	}





	public void doTag() throws JspException, IOException{
		
		
		
		
		
		String s="";
		JspWriter out = getJspContext().getOut();
		for(int i =0;i<list.size();i++) {
			String days="";
			int id = list.get(i).getId();
			
			if(DAO.goingFri(id)) {
				days+=" Friday ";
			}
			if(DAO.goingSat(id)) {
				days+=" Saturday ";
			}
			if(DAO.goingSun(id)) {
				days+=" Sunday ";
			}
			
			s+=" <tr><td> "+ list.get(i).getId() +"</td>"+
					"<td> "+ list.get(i).getName() +"</td>" +
					"<td> "+ list.get(i).getOwnerName() +"</td>"+
					"<td> "+ list.get(i).getBreed() +"</td>"+
					"<td> "+ list.get(i).getGroup() +"</td>"+
					"<td> "+ list.get(i).getGender() +"</td>"+
					"<td> "+ list.get(i).getType() +"</td>"+
					"<td> "+ days +"</td>"+
					"</tr>";
		}
		
		out.println(s);
		
	}
	
	

}
