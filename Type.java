package ca.sheridancollege.Enum;

import java.util.Random;

public enum Type {
	
	Class,Specialty;
	
	public static String choose() {
		Random r = new Random();
        return Type.values()[r.nextInt(2)].toString();
	}

}
