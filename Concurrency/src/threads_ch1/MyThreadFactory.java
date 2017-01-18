package threads_ch1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * 
 * Java provides an interface called ThreadFactory, It has only one method called newThread().
 * The main objective is that all the threads in our module can be created using the implementation of ThreadFactory
 * and following things can be acheived.
 * 1) centralised creation of threads
 * 2) some restrictions on threads.
 * 3) Collecting statistics on threads created.
 * 4) Having a specific naming convention for all the threads
 * 5) Using a own thread object.
 * 
 *
 */
public class MyThreadFactory implements ThreadFactory{

	private String name;
	private int counter;
	private List<String> stats;
	
	public MyThreadFactory(String name) {
		this.name = name;
		counter = 0;
		stats = new ArrayList<>();
	}
	
	@Override
	public Thread newThread(Runnable r){
		Thread thread = new Thread(r, name +"-Thread-"+counter);
		counter++;
		stats.add(String.format("Thread %d has been created with name %s on %s\n", counter,thread.getName(), new Date()));
		return thread;
	}
	
	public String getStats(){
		StringBuilder builder = new StringBuilder();
		
		for (Iterator<String> iterator = stats.iterator(); iterator.hasNext();) {
			builder.append(iterator.next());
			builder.append("\n");
		}
		
		return builder.toString();
	}

}
