package com.chat.user;

import java.util.List;

public class AdminUser extends User implements Administrator{

	public AdminUser(String emailId, String password, String displayName, List<String> tags) {
		super(emailId, password, displayName, tags);
	}

}
