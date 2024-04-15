package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> treeMap= new TreeMap<>();
		
		treeMap.put("Key1", "Pear");
		treeMap.put("Key2", "Apple");
		treeMap.put("Key3", "Orange");
		treeMap.put("Key4", "Banana");
		
		//get set of entries
		Set set= treeMap.entrySet();
		//get iterator
		Iterator it=set.iterator();
		System.out.println("TreeMap contains");
		while(it.hasNext()) {
			
			Map.Entry pair=(Map.Entry)it.next();
			
			System.out.print("Key is : " +pair.getKey()+"and");
			System.out.println("value is: "+pair.getValue());
				
		
		}

		

	}

}
