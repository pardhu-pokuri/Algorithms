package com.chat.user;

import java.util.List;

public class Customer extends User{

	public Customer(String emailId, String password, String displayName, List<String> tags) {
		super(emailId, password, displayName, tags);
	}

}
