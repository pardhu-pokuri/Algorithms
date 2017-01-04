package threads_ch1;

import java.util.concurrent.TimeUnit;

public class FileSearchThreadInterruption {

	public static void main(String[] args) {
		
		FileSearch searchRunnable = new FileSearch("D:\\", "720p");
		Thread thread = new Thread(searchRunnable);
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
		
	}
	
	
	
}
