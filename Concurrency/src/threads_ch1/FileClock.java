package threads_ch1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileClock implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0 ; i < 10 ; i++){
			
			System.out.println("Date is " + new Date());
			
			//if someother thread interrupts this thread while sleeping, sleep method throws an InterruptedException
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("The File clock thread is interrupted during sleep");
			}
			
		}
		
	}

}
