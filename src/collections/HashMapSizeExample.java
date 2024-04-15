package collections;

import java.util.HashMap;

public class HashMapSizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map= new HashMap<>();
		map.put(1, "Coca-cola");
		map.put(2, "pepsi");
		map.put(3, "Thumps-Up");
		map.put(4, "Fenta");
		
		System.out.println("size of the given HashMap " +map.size());

	}

}
