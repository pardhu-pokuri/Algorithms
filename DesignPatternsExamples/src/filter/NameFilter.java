package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * filters Persons based on their names. 
 *
 */
public class NameFilter implements PersonFilter{

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> filtered = new ArrayList<>();
		for (Person person : persons) {
			if(person.getName().contains("hanvitha")){
				filtered.add(person);
			}
		}
		return filtered;
	}

}
