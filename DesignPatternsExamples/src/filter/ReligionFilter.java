package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * filters Persons based on their religions. 
 *
 */
public class ReligionFilter implements PersonFilter{

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> filtered = new ArrayList<>();
		for (Person person : persons) {
			if(person.getReligion().equals("christian")){
				filtered.add(person);
			}
		}
		return filtered;
	}

}
