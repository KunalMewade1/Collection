package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescendingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist= new ArrayList<>();
		alist.add("Apple");
		alist.add("Banana");
		alist.add("Pear");
		alist.add("Mango");
		
		System.out.println("List Before Sorting");
		for(String s:alist)
		{
			System.out.println(s);
			
		}
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("List After Sorting in descending order");
		
		for(String str:alist)
		{
			System.out.println(str);
		}

	}

}
