package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> browsers= new ArrayList<>();
		browsers.add("Google Chrome");
		browsers.add("Mozzilla Firefox");
		browsers.add("Edge");
		browsers.add("Opera");
		//converting arraylist to string array using copyOf()
		String[] browsernames=Arrays.copyOf(browsers.toArray(), browsers.size(),String[].class);
		for(String str:browsernames) {
			System.out.println(str);
		}

	}

}
