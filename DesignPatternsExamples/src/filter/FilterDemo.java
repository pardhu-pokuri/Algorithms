package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		/*
		 * You have a bunch of person objects here,
		 * you want to filter these person objects based on some criteria.
		 * 
		 * You tend to tempt by keeping the filtering logic inside Person class,
		 * But you just can't modify your crucial Person class everytime you want to add new filtering logic.
		 * If you modify your Person class, you have do lots of testing.
		 * 
		 * So the safe bet is , bring the filtering logic outside the Person class,
		 * create a class for each filter criteria, pass the list of objects to this criteria.
		 * This way filtering logic is loosely coupled with Person objects.
		 * 
		 * 
		 */
		List<Person> persons = new ArrayList<>();
		Person hanvitha = new Person(1,25,"hanvitha","christian");
		Person sandeep = new Person(2,28,"sandeep","christian");
		Person somefruit = new Person(3,24,"somefruit","somereligion");
		persons.add(hanvitha);
		persons.add(sandeep);
		persons.add(somefruit);
		
		
		
		AgeFilter agefilter = new AgeFilter();
		System.out.println(agefilter.filter(persons));
		
		NameFilter namefilter = new NameFilter();
		System.out.println(namefilter.filter(persons));
		
		ReligionFilter religionFilter = new ReligionFilter();
		System.out.println(religionFilter.filter(persons));
		
		
		
	}

}
