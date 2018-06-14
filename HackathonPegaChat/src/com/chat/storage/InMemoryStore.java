package com.chat.storage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chat.user.User;

public class InMemoryStore implements ChatStore{

	public static final InMemoryStore INSTANCE = new InMemoryStore(); 
	private Map<String, User> users = new HashMap<>();
	
	
	private InMemoryStore() {
		//making this class singleton
	}
	
	public static InMemoryStore getInstance(){
		return INSTANCE;
	}
	
	@Override
	public List<User> allUsers() {
		return Collections.unmodifiableList(new ArrayList<>(users.values()));
	}

}
