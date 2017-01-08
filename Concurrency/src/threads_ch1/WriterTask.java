package threads_ch1;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class WriterTask implements Runnable{
	
	private Deque<Event> deque;
	
	public WriterTask(Deque<Event> queue) {
		this.deque = queue;
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 100 ; i++){
			
			Event event = new Event();
			event.setDate(new Date());
			event.setEvent(String.format("This event has been created by the Thread-%d .",Thread.currentThread().getId()));
			deque.addFirst(event);
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
