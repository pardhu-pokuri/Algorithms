package strategy;

public class IDValidator implements EmployeeValidator{

	@Override
	public boolean validate(Employee employee) {
		if(employee.getId() >= 1){
			return true;
		}
		return false;
	}

}
