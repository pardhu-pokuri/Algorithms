package strategy;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private List<EmployeeValidator> validators;
	
	public Employee(int id, String name, List<EmployeeValidator> validators) {
		this.id = id;
		this.name = name;
		this.validators = validators;
	}
	
	public boolean validate(){
		for (EmployeeValidator employeeValidator : validators) {
			if (!employeeValidator.validate(this)) {
				return false;
			}
		}
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
