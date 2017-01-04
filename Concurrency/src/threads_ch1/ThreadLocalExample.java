package threads_ch1;

import java.util.concurrent.TimeUnit;

public class ThreadLocalExample {

	public static void main(String[] args) {
		
		unsafeTaskImplementation();
		safeTaskImplementation();
	}


	/**
	 * The {@code UnsafeTask} task is not suitable for sharing among multiple threads because the attributes values changed by one thread
	 * will be using by other threads as well. Hence the output is undetermined here.
	 */
	private static void unsafeTaskImplementation() {
		UnsafeTask unsafeTask = new UnsafeTask();
		
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(unsafeTask);
			thread.start();
			try{
				TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * The {@code SafeTask} task is  suitable for sharing among multiple threads because the attributes inside this task are ThreadLocal and values changed by one thread
	 * will not be using by other threads. Hence the output is very consistent always.
	 */
	private static void safeTaskImplementation() {
		SafeTask safeTask = new SafeTask();
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(safeTask);
			thread.start();
			try{
				TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
