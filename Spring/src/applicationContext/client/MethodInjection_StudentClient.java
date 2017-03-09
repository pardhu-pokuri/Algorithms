package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Student;

public class MethodInjection_StudentClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("method_injection.xml");
		Student student = context.getBean("student",Student.class);
		student.details();
	}

}
