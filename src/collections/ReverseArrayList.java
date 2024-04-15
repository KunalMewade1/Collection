package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Amazon");
		arrayList.add("Facebook");
		arrayList.add("Google");
		arrayList.add("IBM");
		arrayList.add("Testla");
		
		System.out.println("List before reverse:");
		System.out.println(arrayList);
		
		Collections.reverse(arrayList);
		
		System.out.println("After reverse list");
		System.out.println(arrayList);
		
		
  
	}

}
