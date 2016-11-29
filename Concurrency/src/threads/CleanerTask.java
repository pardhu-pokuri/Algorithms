package threads;

import java.util.Date;
import java.util.Deque;

public class CleanerTask implements Runnable {

	Deque<Event> deque;
	
	public CleanerTask(Deque<Event> deque) {
		this.deque = deque;
	}
	
	@Override
	public void run() {
		
		while(true){
			Date date = new Date();
			cleanQueue(date);
		}
		
		
	}

	private void cleanQueue(Date date) {
		
		if(deque.size() == 0){
			return;
		}
		
		boolean delete;
		long difference = 0;
		do{
			delete = false;
			Event last = deque.getLast();
			difference = date.getTime() - last.getDate().getTime();
			if(difference > 10000){
				deque.removeLast();
				System.out.println("Cleaner : Removed :" + last.getEvent());
				delete = true;
			}
			
		}while(delete);
		
		System.out.println("Cleaner : Size of queue is :" + deque.size());
		
	}

}
