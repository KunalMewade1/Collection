package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayListDeserialization {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		try {
			FileInputStream fileIS= new FileInputStream("inputfile.ser");
			ObjectInputStream objIS= new ObjectInputStream(fileIS);
			list=(ArrayList<String>)objIS.readObject();
			objIS.close();
			fileIS.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		}
		catch (ClassNotFoundException ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return;
		}
		for(String s:list) {
			System.out.println(s);
		}

	}

}
