package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.MessagesBean;

public class ResourceBundleClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resourcebundle_config.xml");
		MessagesBean mbean = context.getBean("mbean", MessagesBean.class);
		mbean.details();
		
		
	}

}
