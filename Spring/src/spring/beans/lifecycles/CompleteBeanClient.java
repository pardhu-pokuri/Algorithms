package spring.beans.lifecycles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompleteBeanClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lifecyclebeans.xml");
		System.out.println("context object created.");
		/*
		 * observe that constructor of CompleteBean is called first, then afterPropertiesSet() method.
		 */
		// Note registerShutDownHook() is present in AbstractApplicationContext class.
		((AbstractApplicationContext)context).registerShutdownHook();
		/*
		 * observe that destroy() method is called after this. 
		 */
	}

}
