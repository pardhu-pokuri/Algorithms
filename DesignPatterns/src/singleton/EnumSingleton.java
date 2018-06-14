package singleton;

/**
 * doesn't support lazy initialization.
 * But avoids the problem with reflection.
 */
public enum EnumSingleton {
	
	INSTANCE;
	
	public void doSomething(){
		
	}
	
}
