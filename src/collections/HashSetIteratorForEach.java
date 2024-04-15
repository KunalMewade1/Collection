package collections;

import java.util.HashSet;

public class HashSetIteratorForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset= new HashSet<String>();
		hashset.add("pear");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana");
		
		System.out.println("HashSet Contains");
		for(String str:hashset) {
			System.out.println(str);
		}

	}

}
