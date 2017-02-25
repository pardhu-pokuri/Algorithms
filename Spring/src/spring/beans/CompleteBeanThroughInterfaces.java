package spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * A bean that has all life cycle methods. This bean gets its life cycle
 * methods from the implemented interfaces. Alternatively lifecycle methods
 * can be given from beans xml as well.
 *
 */
public class CompleteBeanThroughInterfaces implements InitializingBean, DisposableBean{

	public CompleteBeanThroughInterfaces() {
		System.out.println("Interface Approach : constructing bean that has life cycle.");
	}
	
	/**
	 * This method gets called when application context is shutdown.
	 */
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Interface Approach : destroying bean");
	}
	
	/**
	 * this method is called after constructor.
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Interface Approach : initializing bean");
	}

}
