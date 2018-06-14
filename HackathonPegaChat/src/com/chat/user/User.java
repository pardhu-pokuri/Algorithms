package com.chat.user;

import java.util.Collections;
import java.util.List;

public abstract class User {
	
	private String emailId;
	private String password;
	private String displayName;
	private List<String> tags;
	
	public User(String emailId, String password, String displayName, List<String> tags){
		this.emailId = emailId;
		this.password = password;
		this.displayName = displayName;
		this.tags = tags;
	}
	
	public String emailId(){
		return emailId;
	}
	
	public void setEmailID(String emailId){
		this.emailId = emailId;
	}
	
	public String password(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String displayName(){
		return displayName;
	}
	
	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}
	
	public List<String> tags(){
		return Collections.unmodifiableList(tags);
	}
	
	public void addTag(String tag){
		this.tags.add(tag);
	}
}
