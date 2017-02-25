package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.beans.Employee;
import spring.beans.HelloWorld;

public class ClientUsingFileSystemXMLAppContext {

	public static void main(String[] args) {
		
		/*
		 * Contrary to ClassPathXmlApplicationContext, FileSystemXmlApplicationContext takes any resource from the file system.
		 * Here full path of beans.xml is given even though it is present in classpath , just for the sake of practice.
		 */
		ApplicationContext context = new FileSystemXmlApplicationContext("E:\\eclipse_neon\\gitworkspace\\Spring\\src\\beans.xml");
		
		HelloWorld helloWorldBean = context.getBean("hwb",HelloWorld.class);
		helloWorldBean.helloworld();
		
		Employee employeeBean = context.getBean("emp", Employee.class);
		employeeBean.details();
	}

}
