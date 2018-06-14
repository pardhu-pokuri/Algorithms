package singleton;

/**
 * The instance of the class is created at the time of class loading itself.
 * The drawback of this approach is instance will be created even if client application might not be using this object.
 * If your singleton class is not using a lot of resources, this is the approach to use. 
 * But in most of the scenarios, Singleton classes are created for resources such as File System, 
 * Database connections etc and we should avoid the instantiation until unless client calls the getInstance method. 
 * Also this method doesn’t provide any options for exception handling.
 *
 */
public class EagerSingleton {
	
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
	
}
