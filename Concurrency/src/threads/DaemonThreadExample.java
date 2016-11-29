package threads;

import java.util.ArrayDeque;
import java.util.Deque;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		Deque<Event> deque = new ArrayDeque<>();
		
		for(int i = 0 ; i < 3 ; i++){
			Thread thread = new Thread(new WriterTask(deque));
			thread.start();
		}
		
		Thread cleanerThread = new Thread(new CleanerTask(deque));
		cleanerThread.setDaemon(true);
		cleanerThread.start();
	}

}
