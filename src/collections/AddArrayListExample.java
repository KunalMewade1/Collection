package collections;

import java.util.ArrayList;

public class AddArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("Callifornia");
		al.add("Boston");
		al.add("San jose");
		al.add("New York");
		
		al.add(2,"Sanfancisco");
		System.out.println("Array List after adding String "+al);
		
		al.add(0,"Texas");
		
		System.out.println("Arraylist after adding another String "+al);
		
		
	}

}
