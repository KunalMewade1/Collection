package collections;

import java.util.ArrayList;

public class ArrayListSize2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		  ArrayList<String> listOfCities= new ArrayList<>();
		  
		  int size=listOfCities.size();
		  
		  System.out.println("Sixe of arraylist after creation"+size);
		  
		  listOfCities.add("California");
		  listOfCities.add("Boston");
		  listOfCities.add("New York");
		  
		  size=listOfCities.size();
		  
		  System.out.println("Size of the arraylist afer adding element"+size);
		  
		  listOfCities.clear();
		  size=listOfCities.size();
		  System.out.println("Size of arraylist after clearing the element");
	}

}
