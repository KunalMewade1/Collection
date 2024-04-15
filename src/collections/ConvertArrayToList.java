package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []cities= {"Boston","Dallas","NewYork","Chicago"};
		
		ArrayList<String> list= new ArrayList<>(Arrays.asList(cities));
		list.add("San francisco");
		list.add("San jose");
		
		for(String str:list) {
			System.out.println(str);
		}
		
	}

}
