package com.query.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimpleClassModel implements ClassModel {
	
	private String className;
	private String superClassName;
	private Map<String,Property> properties = new HashMap<>();

	@Override
	public String className() {
		return className;
	}

	public void setClassName(String className){
		this.className = className;
	}
	
	@Override
	public String superClassName() {
		return superClassName;
	}
	
	public void setSuperClassName(String className){
		this.superClassName = className;
	}

	@Override
	public Map<String, Property> properties() {
		return Collections.unmodifiableMap(properties);
	}
	
	public void addProperty(Property property){
		properties.put(property.name(), property);
	}

}
