package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array = new ArrayList<String>();
		Hashtable h1 = new Hashtable();
		HashMap h2 = new HashMap();
		String s = null;
		h1.put(s, s);
		h2.put(s, s);
		
		
		array.add("one");
		array.add("two");
		array.add("three");
		
		for(int i = 0 ; i < array.size() ; i++){
			
			System.out.println(array.get(i));
			if(i == 1){
				array.add("four");
			}
		}
		
	}

}
