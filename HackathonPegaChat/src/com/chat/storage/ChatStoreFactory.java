package com.chat.storage;

public class ChatStoreFactory {
	
	public static final String INMEMORY = "inmemory";
	
	public static ChatStore getStore(String storeType){
		if(INMEMORY.equals(storeType)){
			return InMemoryStore.getInstance();
		}
		return null;
	}
	
}
