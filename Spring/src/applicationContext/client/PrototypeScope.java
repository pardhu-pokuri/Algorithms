package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Puppy;

public class PrototypeScope {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("scopedbeans.xml");
		System.out.println("Application context created.");
		
		Puppy puppyBean = context.getBean("pub", Puppy.class);
		puppyBean.bark();
		
		Puppy puppyBean1 = context.getBean("pub", Puppy.class);
		
		/*
		 * Observe that hashcodes of puppy beans are different. Since the scope of puppy bean is set to prototype, A new bean 
		 * object will be created by application context on each query.
		 */
		System.out.println(puppyBean);
		System.out.println(puppyBean1);
	}

}
