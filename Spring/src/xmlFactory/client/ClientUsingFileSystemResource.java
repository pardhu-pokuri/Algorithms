package xmlFactory.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import spring.beans.Employee;
import spring.beans.HelloWorld;

public class ClientUsingFileSystemResource {

	public static void main(String[] args) {
		
		/*
		 * Contrary to ClassPathResource, FileSystemResource takes any resource from the file system.
		 * Here full path of beans.xml is given even though it is present in classpath , just for the sake of practice.
		 */
		Resource resource = new FileSystemResource("E:\\eclipse_neon\\gitworkspace\\Spring\\src\\beans.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		HelloWorld helloWorldBean = factory.getBean("hwb", HelloWorld.class);
		helloWorldBean.helloworld();
		
		Employee employeeBean = factory.getBean("emp", Employee.class);
		employeeBean.details();
		
		
	}
	
}
