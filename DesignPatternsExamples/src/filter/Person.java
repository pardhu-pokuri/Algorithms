package filter;

import java.util.List;

public class Person {

	private int id;
	private int age;
	private String name;
	private String religion;

	
	public Person(int id, int age, String name, String religion) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.religion = religion;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", religion=" + religion + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	public List<Person> filter(){
		if(cond1){
			
		}else if(cond2){
			
		}
	}
}
