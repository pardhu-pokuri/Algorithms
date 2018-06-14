package strategy;

public class NameValidator implements EmployeeValidator{

	@Override
	public boolean validate(Employee employee) {
		if(employee.getName() != null && !employee.getName().isEmpty()){
			return true;
		}
		return false;
	}
	

}
