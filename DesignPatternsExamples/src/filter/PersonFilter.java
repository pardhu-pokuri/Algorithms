package filter;

import java.util.List;

/**
 *  create a sub class for each filter criteria.
 *
 */
public interface PersonFilter {

	public List<Person> filter(List<Person> persons);
	
}
