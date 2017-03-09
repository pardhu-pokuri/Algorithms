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
	public void details() {
		
		System.out.println("Id is :" + id);
		System.out.println("Name is :" + name);
		System.out.println("*************");
		System.out.println("Courses : ");
		for (String course : courses) {
			System.out.println(course);
		}
		System.out.println("*************");
		college.details();
		
	}
	
}
