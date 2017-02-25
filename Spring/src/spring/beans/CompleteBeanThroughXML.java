package spring.beans;

/**
 * This bean has two methods initMethod() and destroyMethod() which are used as life cycle methods by 
 * defining them in beans xml.
 */
public class CompleteBeanThroughXML{

	public CompleteBeanThroughXML() {
		System.out.println("XML Approach : constructing bean that has life cycle.");
	}
	
	/**
	 * This method gets called when application context is shutdown.
	 */
	
	public void destroyMethod() throws Exception {
		System.out.println("XML Approach : destroying bean");
	}
	
	/**
	 * this method is called after constructor.
	 */
	public void initMethod() throws Exception {
		System.out.println("XML Approach : initializing bean");
	}

}
