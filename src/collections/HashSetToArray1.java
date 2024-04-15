package collections;

import java.util.HashSet;

public class HashSetToArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet= new HashSet<>();
		hashSet.add("Doctor");
		hashSet.add("Engineer");
		hashSet.add("Lawyer");
		hashSet.add("Police");
		System.out.println("Hashset contain "+hashSet);
		
		String [] array= new String[hashSet.size()];
		int index=0;
		for(String element:hashSet) {
			array[index++]=element;
		}
		System.out.println("Array object contains");
		for(String str:array) {
			System.out.println(str);
			
		}

	}

}
