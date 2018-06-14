package com.chat.storage;

import java.util.List;

import com.chat.user.User;

public interface ChatStore {
	
	public List<User> allUsers();
	
	
}
