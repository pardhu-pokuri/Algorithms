package threads_ch1;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GroupableTask implements Runnable{

	private Result result;
	
	public GroupableTask(Result result) {
		this.result = result;
	}
	
	@Override
	public void run() {
		String name  =  Thread.currentThread().getName();
		System.out.printf("Started thread : %s \n",name);
		try {
			doTask();
			result.setName(name);
		} catch (InterruptedException e) {
			System.out.printf("Thread %s : Interrupted \n", name);
			return;
		}
		System.out.println("Finished Thread " + name);
		
	}

	private void doTask() throws InterruptedException {
		Random random = new Random(new Date().getTime());
		int timeout = (int)(random.nextDouble() * 100);
		System.out.printf("Thread %s sleeping time is %d \n", Thread.currentThread().getName(), timeout);
		TimeUnit.SECONDS.sleep(timeout);
		
	}
}
