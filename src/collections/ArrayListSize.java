package collections;

import java.util.ArrayList;

public class ArrayListSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArrayList<>();
		System.out.println("Size beofre adding the element" +al.size());
		
		al.add(11);
		al.add(3);
		al.add(5);
		al.add(9);
		al.add(4);
		
		System.out.println("Size after adding the element" +al.size());
		al.remove(1);
		al.remove(2);
		
		System.out.println("Size after adding the element" +al.size());
		
		System.out.println("Resulting ArrayList");
		
		for(int num:al) {
			System.out.println(num);
		}
	}

}
