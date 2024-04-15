package collections;

import java.util.ArrayList;

public class ArrayListContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given an element to check if element exist or not
		ArrayList<Integer> al= new ArrayList<>();
		al.add(3);
		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);
		
		if(al.contains(7))
		{
			System.out.println("Element found inthe list");
		}
		else {
			System.out.println("Element was not found in the list");
		}

	}

}
