
public interface IDirectory {

	/**
	 * adds a person to directory
	 */
	public void addEntry(String name, Integer number);

	/**
	 * delete a person from directory
	 */
	public void deleteEntry(String name);
	
	/**
	 * updates a person entry with given number
	 */
	public void updateEntry(String name, Integer number);
	
	/**
	 * checks if a person exists with given name in directory. 
	 */
	public boolean searchDirectory(String name);
	
	/**
	 * checks if a number exists in directory. 
	 */
	public boolean searchDirectory(Integer number);
	
	
	
}
