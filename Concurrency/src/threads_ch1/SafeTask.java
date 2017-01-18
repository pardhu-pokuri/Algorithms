package threads_ch1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SafeTask implements Runnable{
	/**
	 * the start date is thread local here. Each thread using this runnable object will have its own copy of this variable.
	 * Value updated by one thread, will not affect other threads.
	 * ThreadLocal has a method called initialValue() , which determines the initial value of this variable.
	 * See Also InherentThreadLocal class. 
	 */
	private ThreadLocal<Date> startDate = new ThreadLocal<Date>(){
		protected Date initialValue() {
			return new Date();
		};
	};
	
	@Override
	public void run() {
		
		System.out.printf("Starting Thread : %s : %s \n", Thread.currentThread().getId(), startDate.get());
		
		try {
			TimeUnit.SECONDS.sleep((int)Math.rint(Math.random() * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Thread Finished : %s : %s \n", Thread.currentThread().getId(), startDate.get());
		
		
		
	}


}
