package com.query.model;

public class SimpleProperty implements Property{
	
	private String name;
	private String type;
	private String expression;
	
	@Override
	public String name() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String type() {
		return type;
	}

	public void setType(String type){
		this.type = type;
	}
	
	@Override
	public String expression() {
		return expression;
	}
	
	public void setExpression(String expression){
		this.expression = expression;
	}

}
