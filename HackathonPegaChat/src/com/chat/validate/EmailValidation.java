package com.chat.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chat.user.User;

public class EmailValidation implements Validator<User> {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validate(User user) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.emailId());
		return matcher.find();
	}
}
