package com.chat.validate;

import com.chat.user.User;

public class NameValidator implements Validator<User>{

	@Override
	public boolean validate(User user) {
		return user.displayName() != null;
	}

}
