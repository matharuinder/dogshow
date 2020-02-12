package ca.sheridancollege.Enum;

import java.util.Random;

public enum Breed {
	
	BullDog, Beagle, Poodle, Rottweiler, Yorkshire, GermanShepherd, Husky, GreatDane, Pomeranian, Havanese, Brittany, Mastiff, Vizsla, Pug, Chihuahua, Maltese, Collie, Akita, BloodHound, Papillon;
	
	public static String choose() {
		Random r = new Random();
        return Breed.values()[r.nextInt(20)].toString();
	}

}
