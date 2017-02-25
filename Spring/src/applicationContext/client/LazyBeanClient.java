package applicationContext.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.LazyBean;

public class LazyBeanClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lazybeans.xml");
		System.out.println("Application Context created.");
		/*
		 * Since the LazyBean is set to lazy initialization, Observe that its constructor will be called
		 * first time we queried for its bean. On subsequent queries constructor is not called since lazybean
		 * scope is set to singleton by default.
		 *
		 */
		LazyBean lazyBean = context.getBean("lb", LazyBean.class);
		lazyBean.details();
		System.out.println(lazyBean);
		LazyBean lazyBean1 = context.getBean("lb", LazyBean.class);
		lazyBean1.details();
		System.out.println(lazyBean1);
		
		
		
	}

}
