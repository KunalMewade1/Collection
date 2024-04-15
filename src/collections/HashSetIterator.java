package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset= new HashSet<String>();
		hashset.add("pear");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana");
		//get iterator
		Iterator<String>it=hashset.iterator();
		//show hashset contains
		System.out.println("HashSet contain");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
