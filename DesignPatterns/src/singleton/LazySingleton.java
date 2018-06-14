package singleton;

/**
 * This is LazySingleton. It created the singleton object only when it is required i.e when
 * client application asked for the singleton object for the first time.
 * 
 */
public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {
	}
	
	public static LazySingleton getInstance(){
		if(instance == null){
			try{
				instance = new LazySingleton();
			}catch(Exception e){
				throw new RuntimeException(e.getMessage());
			}
		}
		return instance;
	}
}
