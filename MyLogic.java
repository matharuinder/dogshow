package ca.sheridancollege.Logic;

import java.util.ArrayList;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.Enum.*;

public class MyLogic {
	
	public static void main(String[] args) {
		createMyDogs();
	}
	
	public static ArrayList<Dog> createMyDogs(){
		ArrayList<Dog> myDogs = new ArrayList();
		
		for(int i=0;i<100;i++) {
			myDogs.add(new Dog(Name.choose(),OwnerName.choose(),Breed.choose(),Group.choose(),Gender.choose(),Type.choose()));
			//System.out.println(myDogs.get(i));
		}
		
		return myDogs;
	}

}
