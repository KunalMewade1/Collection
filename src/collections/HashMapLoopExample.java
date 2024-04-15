package collections;

import java.util.HashMap;

public class HashMapLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashmap= new HashMap<>();
		
		hashmap.put("KEY1", "VALUE1");
		hashmap.put("KEY2", "VALUE2");
		
		System.out.println("iterating or looping map usin for each loop");
		for(String key:hashmap.keySet()) {
			System.out.println("KEY"+key+"value"+hashmap.get(key));
		}
	}

}
