package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashmap= new HashMap<>();
		
		hashmap.put("KEY1", "VALUE1");
		hashmap.put("KEY2", "VALUE2");
		
		Set<String> keySet=hashmap.keySet();
		Iterator<String> keysetIterator=keySet.iterator();
		
		while(keysetIterator.hasNext()) {
			String key=keysetIterator.next();
			System.out.println("key:"+ key +"Value"+ hashmap.get(key));
		}
		
	}

}
