package threads_ch1;

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
		/**
		 * sets a thread as Daemon. 
		 * Java has a special kind of thread called daemon thread. These kind of threads have very low
		 * priority and normally only executes when no other thread of the same program is running.
		 * When daemon threads are the only threads running in a program, the JVM ends the program
		 * finishing these threads. With these characteristics, the daemon threads are normally used as service providers for
		 * normal (also called user) threads running in the same program.  They can't do
		 * important jobs because we don't know when they are going to have CPU time and they can
		 * finish any time if there aren't any other threads running. A typical example of these kind of
		 * threads is the Java garbage collector.
		 */
		cleanerThread.setDaemon(true);
		cleanerThread.start();
	}

}
