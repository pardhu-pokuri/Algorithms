package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Employee;
import spring.beans.HelloWorld;
import spring.beans.Person;

/**
 * 
 * A bean has 5 scopes:
 * 1) Request
 * 2) Session
 * 3) AppContext
 * 4) Singleton
 * 5) Prototype
 * 
 * By default ApplicationContext creates object with singleton scope.
 * ApplicationContext creates objects of bean at the time of ApplicationContext
 * object's creation itself. When an ApplicatonContext is queried using getBean() it returns the already
 * created singleton bean object.
 *
 */

public class SingletonScope {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("scopedbeans.xml");
		/**
		 * observe that constructor of person object is called already even before this print statement.
		 * It means that person object is created while creation of ApplicationContext Object.
		 */
		System.out.println("Applcation context Object created");
		
		Person personBean = context.getBean("pb", Person.class);
		Person personBean2 = context.getBean("pb", Person.class);
		//observe the hash code of both person beans. It turns out to be same since the default scope of person bean is singleton
		// and same object will be returned by application context for every query.
		System.out.println(personBean);
		System.out.println(personBean2);
	}
	
	
}
