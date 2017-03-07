package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Tourist;

public class ConstructorInjection_TouristClient {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection.xml");
	public static void main(String[] args) {
		
		singleparameter();
		twoparameters();
		listparameters();
		mapparameters();
		
	}

	// constructor injection with single parameter of object type for constructor
	private static void singleparameter() {
		System.out.println("********************************************");
		System.out.println("Constructor with Single object type parmeter");
		Tourist bean1 = context.getBean("singleparamter",Tourist.class);
		bean1.tourSingleCountry();
		System.out.println("********************************************");
	}
	
	// constructor injection with two parameters of object type for constructor
	private static void twoparameters() {
		System.out.println("********************************************");
		System.out.println("Constructor with two object types parmeter");
		Tourist bean1 = context.getBean("twoparamters_onenested",Tourist.class);
		bean1.tourTwoCountries();
		System.out.println("********************************************");
	}

	// constructor injection with list parameter type for constructor
	private static void listparameters() {
		System.out.println("********************************************");
		System.out.println("Constructor with list parmeter");
		Tourist bean1 = context.getBean("listofparamters",Tourist.class);
		bean1.tourListCountries();
		System.out.println("********************************************");
	}

	// constructor injection with map parameter type for constructor
	private static void mapparameters() {
		System.out.println("********************************************");
		System.out.println("Constructor with map parmeter");
		Tourist bean1 = context.getBean("mapofparamters",Tourist.class);
		bean1.tourMappedCountries();
		System.out.println("********************************************");
	}

}
