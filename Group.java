package ca.sheridancollege.Enum;

import java.util.Random;

public enum Group {
	
	Hounds,Terriers,Toys,Herding,SportingDogs,WorkingDogs,NonSporting;
	
	public static String choose() {
		Random r = new Random();
		
		if(Group.values()[r.nextInt(7)].toString().equals("SportingDogs"))
			return "Sporting Dogs";
		if(Group.values()[r.nextInt(7)].toString().equals("WorkingDogs"))
			return "Working Dogs";
		if(Group.values()[r.nextInt(7)].toString().equals("NonSporting"))
			return "Non-Sporting";
		
		
        return Group.values()[r.nextInt(4)].toString();
	}

}
