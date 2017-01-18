package threads_ch1;

import java.util.concurrent.TimeUnit;

public class ThreadFactoryExecution {

	public static void main(String[] args) {
		
		MyThreadFactory factory = new MyThreadFactory("Myfactory");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread;
		
		for (int i = 0; i < 10; i++) {
			thread = factory.newThread(runnable);
			thread.start();
		}
		System.out.println("Thread statistics are as follows:");
		System.out.println(factory.getStats());
		
	}

}
