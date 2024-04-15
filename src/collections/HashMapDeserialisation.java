package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDeserialisation {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= null;
		 try {
			 FileInputStream fis= new FileInputStream("hashmap.ser");
			 ObjectInputStream ois= new ObjectInputStream(fis);
			 map=(HashMap<Integer, String>)ois.readObject();
			 ois.close();
			 fis.close();
		 }
		 catch(IOException ioe){
			 ioe.printStackTrace();
			 
		 }
		 catch(ClassNotFoundException e) {
			 System.out.println("Class Not found");
			 e.printStackTrace();
			 return;
			 
		 }
           System.out.println("deserialization HashMAP");
           Set set=map.entrySet();
           Iterator iterator=set.iterator();
           while(iterator.hasNext()) {
        	  Map.Entry mentry=(Map.Entry)iterator.next();
        	  System.out.print("Keys:"+mentry.getKey()+" &value: ");
        	  System.out.println(mentry.getValue());
           }
           
	}

}
