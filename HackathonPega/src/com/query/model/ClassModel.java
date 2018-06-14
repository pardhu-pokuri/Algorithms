package com.query.model;

import java.util.Map;

public interface ClassModel {
	
	public String className();
	
	public String superClassName();
	
	public Map<String,Property> properties();
	
}
