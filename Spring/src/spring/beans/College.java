package spring.beans;

public class College {
	
	private String name;
	
	private String[] departments;
	
	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartments(String[] departments) {
		this.departments = departments;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void details() {
		
		System.out.println("College Name is :" + name);
		System.out.println("********************");
		System.out.println("Departments :");
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i]);
		}
		System.out.println("********************");
		address.details();
	}
	
	
}
