package collections;

import java.util.HashSet;

public class HashSetContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset= new HashSet<String>();
		hashset.add("pear");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana");
		
		if(hashset.contains("Apple")) {
			System.out.println("Element is present in hashset");
			
		}
		else {
			System.out.println("Element is not present in hashset");
		}

	}

}
