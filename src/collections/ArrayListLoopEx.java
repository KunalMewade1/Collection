package collections;

import java.util.ArrayList;

public class ArrayListLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<>();
		al.add(3);
		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);
		
		System.out.println("Using advance for loop");
		for(Integer num:al) {
			System.out.println(num);
		}

	}

}
