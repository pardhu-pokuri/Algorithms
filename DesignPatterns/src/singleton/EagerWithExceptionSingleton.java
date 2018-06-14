package singleton;

/**
 * This is EagerSingleton with exception handling.
 * 
 * This is same as EagerSingleton except that creation of singleton object is moved to
 * static block which gives control to handle exceptions.
 *
 */
public class EagerWithExceptionSingleton {
	
	private static final EagerWithExceptionSingleton instance;
	
	static{
		try{
			instance = new EagerWithExceptionSingleton();
		}catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
	}
	
	private EagerWithExceptionSingleton() {
	}
	
	public static EagerWithExceptionSingleton getInstance(){
		return instance;
	}
}
