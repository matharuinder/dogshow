package ca.sheridancollege.Enum;

import java.util.Random;

public enum Gender {
	
	Male,Female;
	
	public static String choose() {
		Random r = new Random();
        return Gender.values()[r.nextInt(2)].toString();
	}

}
