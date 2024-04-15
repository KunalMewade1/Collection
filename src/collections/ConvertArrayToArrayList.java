package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"AAA","BBB","CCC","DDD"};
		
		ArrayList<String> al= new ArrayList<>();
		
		Collections.addAll(al, strArr);
		
		al.add("YYY");
		al.add("ZZZ");
		
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
