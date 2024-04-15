package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLoopExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, String> hashmap= new HashMap<>();
		
			hashmap.put("KEY1", "VALUE1");
			hashmap.put("KEY2", "VALUE2");
			
			System.out.println("Iterating the HashMap using entry set and for each loop");
			
			Set<Map.Entry<String, String>> entryset=hashmap.entrySet();
			
			for(Map.Entry<String, String> entry:entryset) {
				System.out.println("Key: "+entry.getKey()+" value: " +entry.getValue());
			}

	}

}
