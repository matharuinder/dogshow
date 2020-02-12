package ca.sheridancollege.customtags;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.Beans.ShowList;



public class ViewGroup extends SimpleTagSupport {
	
	private ArrayList<ShowList> list;
	
	



	public void setList(ArrayList<ShowList> list) {
		this.list = list;
	}





	public void doTag() throws JspException, IOException{
		String s="";
		JspWriter out = getJspContext().getOut();
		for(int i =0;i<list.size();i++) {
			s+=" <tr><td> "+ list.get(i).getNum() +"</td>"+
					"<td> "+ list.get(i).getBreed() +"</td>" +
					"<td> "+ list.get(i).getMc() +"</td>"+
					"<td> "+ list.get(i).getFc() +"</td>"+
					"<td> "+ list.get(i).getMs() +"</td>"+
					"<td> "+ list.get(i).getFs() +"</td>"+
					"</tr>";
		}
		
		out.println(s);
		
	}
	
	

}
