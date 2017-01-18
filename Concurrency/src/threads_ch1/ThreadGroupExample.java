package threads_ch1;

import java.util.concurrent.TimeUnit;

public class ThreadGroupExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ThreadGroup group = new ThreadGroup("interruptor");
		Result result  = new Result();
		GroupableTask task = new GroupableTask(result);
		for (int i = 0; i < 10; i++) {
			/** 
			 * groups the threads created.In general related threads can be grouped like this.
			 *  Using threadgroup object we can perform some operation on all the threads present in the threadgroup in a single method call.
			 *  Ex: threadGroup.interrupt() interrupts all the threads in the group.
			 */
			Thread thread = new Thread(group, task);
			try {
				TimeUnit.SECONDS.sleep(1);
				thread.start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Number of threads in group : " + group.activeCount());
		System.out.println("Information about thread group:");
		group.list();
		System.out.println("*****");
		
		//gives count of active threads in the group
		Thread[] threads = new Thread[group.activeCount()];
		//adds the active thread references of the group to the passed array.
		group.enumerate(threads);
		
		for (int i = 0; i < threads.length; i++) {
			System.out.printf("Thread %s : %s \n", threads[i].getName(), threads[i].getState());
		}
			
		while(group.activeCount() > 9){
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//intterupts all the threads in the group.
		group.interrupt();
	}

}
