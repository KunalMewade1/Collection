package collections;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet= new HashSet<>();
		hashSet.add("Doctor");
		hashSet.add("Engineer");
		hashSet.add("Lawyer");
		hashSet.add("Police");
		System.out.println("Hashset contain "+hashSet);
		
		//creating array of Hashset size
		String[] array= new String[hashSet.size()];
		// printing array elements
		hashSet.toArray(array);
		System.out.println("Array Contains:");
		for(String str:array)
		{
			System.out.println(str);
		}

	}

}
