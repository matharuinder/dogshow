package ca.sheridancollege.Enum;

import java.util.Random;

public enum Name {
	
	Max,Charlie,Cooper,Buddy,Jack,Rocky,Oliver,Bear,Duke,Tucker,Bella,Lucy,Daisy,Luna,Lola,Sadie,Molly,Maggie,Bailey,Sophie;

	public static String choose() {
		Random r = new Random();
        return Name.values()[r.nextInt(20)].toString();
	}
	
}
