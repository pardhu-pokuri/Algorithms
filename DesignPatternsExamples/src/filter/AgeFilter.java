package filter;

import java.util.ArrayList;
import java.util.List;


/**
 * filters Persons based on their age. 
 *
 */
public class AgeFilter implements PersonFilter{

	@Override
	public List<Person> filter(List<Person> persons) {
		
		List<Person> filtered = new ArrayList<>();
		for (Person person : persons) {
			if(person.getAge() >= 25){
				filtered.add(person);
			}
		}
		
		
		return filtered;
	}

}
