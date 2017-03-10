package spring.beans;

import org.springframework.context.support.ResourceBundleMessageSource;

public class MessagesBean {
	
	private ResourceBundleMessageSource messageSource;
	
	private String message1;

	public ResourceBundleMessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(ResourceBundleMessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	public void details(){
		String message1 = messageSource.getMessage("message1", null, null);
		System.out.println("Message1 : " + message1);
		String message2 = messageSource.getMessage("message2", new Object[]{"message","parameters"}, null);
		System.out.println("Message2 : " + message2);
	}
	
	

}
