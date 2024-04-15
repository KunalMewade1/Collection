package collections;

import java.util.ArrayList;

public class ConvertArrayListToArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities= new  ArrayList<>();
		cities.add("Boston");
		cities.add("Dallas");
		cities.add("Sanjose");
		cities.add("Chicago");
		//cities.add("Boston");
		
		//Arraylist convert to array using toArray()
		
		String citiesnames[]= cities.toArray(new String[cities.size()]);
		
		//printing elements
		for(String str:citiesnames) {
			System.out.println(str);
		}
		
		

	}

}
