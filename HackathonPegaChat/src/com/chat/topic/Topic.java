package com.chat.topic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import com.chat.Message.Message;
import com.chat.user.User;

public class Topic {
	
	private String name;
	
	private String description;
	
	private List<String> tags;
	
	private User topicOwner;

	private List<User> subscribers;
	
	private List<User> blockedSubscribers;
	
	private LinkedBlockingQueue<Message> pool;
	
	private List<Message> processedPool;
	
	public Topic(String name, String description, List<String> tags, User topicOwner) {
		this.name = name;
		this.description = description;
		this.tags = tags;
		this.topicOwner = topicOwner;
	}
	
	public String name(){
		return this.name;
	}
		
	public String description(){
		return description;
	}

	public List<String> tags(){
		return Collections.unmodifiableList(tags);
	}
	
	public List<User> subscribers(){
		return Collections.unmodifiableList(subscribers);
	} 
	
	public void subscribe(User user){
		subscribers.add(user);
	}
	
	public void unSubscribe(User user){
		Iterator<User> iterator = subscribers.iterator();
		while (iterator.hasNext()) {
			User eachUser = iterator.next();
			if(user.emailId().equals(eachUser.emailId())){
				iterator.remove();
			}
		}
	}
}
