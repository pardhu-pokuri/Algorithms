package singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton(){
		
	}
	
	/**
	 * Making the method synchronized decreases performance as all threads need to wait for
	 * the lock just to get the instance even when instance is already created.
	 */
	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance == null){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public static ThreadSafeSingleton getInstance_syncBlock(){
		//we need to synchronize after ensuring that instance is null
		if(instance == null){
			synchronized (ThreadSafeSingleton.class) {
				//we need to check if instance is null again before creating object ,as few other threads
				//might have crossed first null check and waiting for lock
				if(instance == null){
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

}
