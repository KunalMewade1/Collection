package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList= new LinkedList<>();
		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add("Pear");
		linkedList.add("Orange");
		//coveting linkedlist t0 arraylist
		
		List<String> list= new ArrayList<>(linkedList);  
		
		for(String s:list) {
			System.out.println(s);
		}
		

	}

}
