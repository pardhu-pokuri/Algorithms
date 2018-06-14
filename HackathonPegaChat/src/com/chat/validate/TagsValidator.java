package com.chat.validate;

import com.chat.user.User;

public class TagsValidator implements Validator<User>{

	@Override
	public boolean validate(User user) {
		return !user.tags().isEmpty();
	}

}
