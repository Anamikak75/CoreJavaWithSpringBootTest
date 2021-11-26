package learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class collectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		ArrayList<String> list1=new ArrayList<String>();//Creating arraylist  
		list1.add("Ravi");//Adding object in arraylist  
		list1.add("Vijay");  
		list1.add("Ravi");  
		list1.add("Ajay"); 
		
		HashMap<String, List<String>> hm= new HashMap<String, List<String>>();
		hm.put("1", list);
		hm.put("2", list1);
		
		System.out.println(hm);
	}

}
