package collections;

import java.util.ArrayList;

public class ConvertArrayToArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<>();
		String[] strArr= {"AAA","BBB","CCC","DDD"};
		
		for(int i=0;i<strArr.length;i++) {
			al.add(strArr[i]);
		}
		 for(String str:al) {
			 System.out.println(str);
		 }
	}

}
