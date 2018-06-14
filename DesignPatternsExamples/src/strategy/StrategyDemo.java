package strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyDemo {
	
	public static void main(String[] args) {
		
		/* 
		 * You have an object called Employee, it needs some validations about it contents,
		 * Ideally an object should know how to validate itself. So you should write the
		 * validation logic inside the Employee class. But in future, if a new validations
		 * need to be added, you have to change your crucial Employee class and it requires lots of testing.
		 * 
		 * So somehow we should make validation logic loosely coupled with Employee class, But validation should be done
		 * inside the Employee class.
		 * 
		 * So send list of validators in constructor while creating Employee object, Now the employee objects
		 * knows has list of validators. Now write a validate() method inside Employee class which will use these
		 * validator objects to validate Employee class.
		 * 
		 * Here you have brought the validation logic outside the employee class, so your validations are loosely coupled
		 * with Employee class. 
		 * 
		 * Since you are passing list of validators to constructor while creating object, it is equivalent to passing
		 * strategies about validations to your Employee object externally. Hence the name Strategy pattern.
		 * 
		 */
		List<EmployeeValidator> validators = new ArrayList<>();
		IDValidator idValidator = new IDValidator();
		NameValidator nameValidator = new NameValidator();
		validators.add(idValidator);
		validators.add(nameValidator);
		
		Employee e1 = new Employee(0, "somename", validators);
		System.out.println(e1.validate());
		
		Employee e2 = new Employee(1, "", validators);
		System.out.println(e2.validate());
		
		Employee e3 = new Employee(1, "somename", validators);
		System.out.println(e3.validate());
		
	}

}
