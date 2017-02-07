
public class ValidationUtil {

	
	//validate format
	public static boolean isValidFormat(String entry){
		
		//first given input should not be null.
		if(entry == null){
			return false;
		}
		
		//There must be only two colons in the input
		int firstColon = entry.indexOf(":");
		int secondColon = entry.indexOf(":",firstColon+1);
		int thirdColon = entry.indexOf(":",secondColon+1);
		
		if(firstColon != -1 && secondColon != -1 && thirdColon == -1){
				return true;
		}
		
		//if any one of the above conditions fail return false;
		return false;
	}
	
	
	//validate name
	public static boolean isValidName(String name){

		if(name == null){
			return false;
		}
		if(name.length() == 0){
			return false;
		}
		
		return true;
	}
	
	//validate number
	public static boolean isValidNumber(String number){
		
		if(number == null){
			return false;
		}
		
		if(number.length() == 0){
			return false;
		}
		
		try{
			Integer.valueOf(number);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}
	
	//gives a valid number even if input is invalid.
	public static Integer getValidNumber(String number){
		
		Integer value;
		try{
			 value = Integer.valueOf(number);
		}catch(Exception e){
			return 0;
		}
		return value;
	}
	
	
}
