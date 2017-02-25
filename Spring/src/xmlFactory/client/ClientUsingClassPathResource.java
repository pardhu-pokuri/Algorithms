package xmlFactory.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.beans.Employee;
import spring.beans.HelloWorld;

/**
 * 
 * XMLBeanFactory acts as container here.
 * BeanFactory.getBean() creates objects of beans every time we query for it.
 */
public class ClientUsingClassPathResource {

	public static void main(String[] args) {
		
		/*
		 * ClassPath resource loads amy resource from classpath. 
		 */
		Resource resource = new ClassPathResource("beans.xml");
		/* beans.xml is passed to XMLBeanFactory as a resource. Instead of we explicitly creating objects of bean,
		 * BeanFactory creates objects for bean when we call getBean() method.
		 */
		BeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		HelloWorld helloWorldBean = (HelloWorld)xmlBeanFactory.getBean("hwb");
		helloWorldBean.helloworld();
		
		//passing bean class object to avoid typecasting.
		Employee employeeBean = xmlBeanFactory.getBean("emp", Employee.class);
		employeeBean.details();
		
	}

}
