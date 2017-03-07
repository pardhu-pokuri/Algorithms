package spring.beans;

import java.util.List;

public class Student {
	
	private int id;
	
	private String name;
	
	private List<String> courses;
	
	private College college;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
}
