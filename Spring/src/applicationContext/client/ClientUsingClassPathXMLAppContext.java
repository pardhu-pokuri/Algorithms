package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Employee;
import spring.beans.HelloWorld;

/**
 * 
 * Application Context acts as a container here.
 * By Default ApplicationContext creates objects of bean at the time of creating ApplicationContext.
 * And getBean() method returns the already created bean object. This is called singleton scope.
 * This can be changed using attributes of <beans>. 
 *
 */
public class ClientUsingClassPathXMLAppContext {

	public static void main(String[] args) {

		/**
		 * beans.xml is passed to ApplicationContext. Instead of we creating objects for beans, ApplicationContext
		 * creates bean objects for us.
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld helloWorldBean = context.getBean("hwb",HelloWorld.class);
		helloWorldBean.helloworld();
		
		Employee employeeBean = context.getBean("emp", Employee.class);
		employeeBean.details();
		
		
		
	}

}
