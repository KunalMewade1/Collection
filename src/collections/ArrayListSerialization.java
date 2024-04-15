package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Boston");
		list.add("Dallas");
		list.add("Newyork");
		try {
			FileOutputStream fileos= new FileOutputStream("inputfile.ser");
			ObjectOutputStream objos= new ObjectOutputStream(fileos);
			objos.writeObject(list);
			objos.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
