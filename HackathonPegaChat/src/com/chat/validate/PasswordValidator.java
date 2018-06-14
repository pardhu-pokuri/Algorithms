package com.chat.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chat.user.User;

public class PasswordValidator implements Validator<User>{

	public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
			Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validate(User user) {
		Matcher matcher = VALID_PASSWORD_REGEX.matcher(user.password());
		return matcher.find();
	}

}
