package com.chat.validate;

public interface Validator<T> {
	
	public boolean validate(T object);

}
