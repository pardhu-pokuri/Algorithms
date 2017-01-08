package threads_ch1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class JoiningThreadsExample {

	public static void main(String[] args) {
		
		Thread dataSourcesLoader = new Thread(new Runnable(){
			
			@Override
			public void run() {
				
				System.out.println("Data Sources Loading Started " + new Date());
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Data Sources Loading Completed");
				
			}
			
			
		});
		
		Thread networkConnectionsLoader = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("Network Connections Loader Started " + new Date());
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Network Connections Loader Finished");
				
			}
		});
		
		dataSourcesLoader.start();
		networkConnectionsLoader.start();
		
		try {
			dataSourcesLoader.join();
			networkConnectionsLoader.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread completed " + new Date());
		
	}

}
