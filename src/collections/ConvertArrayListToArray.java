package collections;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> fruits= new ArrayList<>();
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Mango");
			fruits.add("Pear");
			fruits.add("Orange");
			// Array list to string array conversion
			String[] str= new String[fruits.size()];
			for(int i=0;i<fruits.size();i++) {
				str[i]=fruits.get(i);
				
			}
			for(String s:str) {
				System.out.println(s);
			}
	}

}
