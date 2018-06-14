package practice;

import java.util.HashMap;

public class HashExample {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "heshma";
		p1.designation = "sse";
		p1.hashCode();
		Person p2 = new Person();
		p2.name = "heshma";
		p2.designation = "sse";
		
		HashMap<Person, String> myMap = new HashMap<>();
		myMap.put(p1, "unninai");
		
		
		System.out.println(myMap.get(p1));
		System.out.println(myMap.get(p2));
		
		
	}

}
