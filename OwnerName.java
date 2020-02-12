package ca.sheridancollege.Enum;

import java.util.Random;

public enum OwnerName {
	

	Olivia,Oliver,Amelia,Harry,Isla,Jack,Emily,George,Ava,Noah,Lily,Charlie,Mia,Jacob,Sophia,Alfie,Isabella,Freddie,Grace,Oscar;

	public static String choose() {
		Random r = new Random();
        return OwnerName.values()[r.nextInt(20)].toString();
	}

}
