package collections;

import java.util.ArrayList;

public class RemoveMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("Callifornia");
		al.add("Boston");
		al.add("San jose");
		al.add("New York");
		al.add("Sanfancisco");
		
		System.out.println("Given ArrayList beofore Remove method");
		
		for(String str:al) {
			System.out.println(str);
		}
		
		al.remove(0);
		al.remove(2);
		al.remove(1);
		
		System.out.println("ArrayList After remove method");
		for(String str2:al) {
			System.out.println(str2);
		}

	}

}
