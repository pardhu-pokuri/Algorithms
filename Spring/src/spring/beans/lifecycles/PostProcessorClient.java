package spring.beans.lifecycles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.CompleteBeanThroughInterfaces;
import spring.beans.CompleteBeanThroughXML;

public class PostProcessorClient {

	public static void main(String[] args) {
		/*
		 * postprocessbeans.xml has PostProcessor defined, So postProcessBeforeInitialization() method will be called first,
		 * followed by init method , followed by postProcessAfterInitialization() method.  
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessbeans.xml");
		System.out.println("Application context created.");
		context.getBean("cbi", CompleteBeanThroughInterfaces.class);
		System.out.println("*********");
		context.getBean("cbx",CompleteBeanThroughXML.class);
	}
	
}
