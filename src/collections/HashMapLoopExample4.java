package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLoopExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashmap= new HashMap<>();
		
		hashmap.put("KEY1", "VALUE1");
		hashmap.put("KEY2", "VALUE2");
		
		System.out.println("Iterating the HashMap using entry set and for each loop");
		
		Set<Map.Entry<String, String>> entrySet1=hashmap.entrySet();
		
		Iterator<Map.Entry<String, String>>entrySetIterator= entrySet1.iterator();
		while(entrySetIterator.hasNext()) {
			Map.Entry<String, String>entry=entrySetIterator.next();
				
				System.out.println("Key: "+entry.getKey()+" value: " +entry.getValue());
			}
		}

	}


