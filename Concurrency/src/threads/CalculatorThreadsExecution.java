package threads;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorThreadsExecution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//executeThreads();
		
		/*try {
			executeThreadsWithStatus();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		printRunningThreadStatus();

	}
	
	private static void executeThreads(){
		
		for(int i = 1 ; i <= 10 ; i++){
			Thread thread = new Thread(new Calculator(i));
			thread.start();
		}
		
	}
	
	private static void executeThreadsWithStatus() throws IOException{
		
		Thread[] threads = new Thread[10];
		Thread.State[] statuses = new Thread.State[10];
		
		for(int i = 0 ; i < 10 ; i++){
			
			threads[i] = new Thread(new Calculator(i+1));
			
			if((i+1) % 2 == 0){
				threads[i].setPriority(Thread.MAX_PRIORITY);
			}else{
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			
			threads[i].setName("MyThread" + i);
			
		}
		
		try(FileWriter fw = new FileWriter("./logs.txt");
				PrintWriter pw = new PrintWriter(fw);){
			
			for(int i = 0 ; i < 10 ; i++){
				pw.println("Main : Status of thread " + i + " : " + threads[i].getState());
				statuses[i] = threads[i].getState();
				
			}
			
			for(int i = 0 ; i < 10 ; i ++){
				threads[i].start();
			}
			
			boolean finish = false;
			
			while(!finish){
				
				for(int i = 0 ; i < 10 ; i++){
					
					if(threads[i].getState() != statuses[i]){
						pw.printf("Main : Id %d - %s\n",threads[i].getId(),threads[i].getName());
						pw.printf("Main : Priority: %d\n",threads[i].getPriority());
						pw.printf("Main : Old State: %s\n",statuses[i]);
						pw.printf("Main : New State: %s\n",threads[i].getState());
						pw.printf("Main : ************************************\n");
						statuses[i] = threads[i].getState();
					}
				}
				
				finish = true;
				for(int i = 0 ; i < 10 ; i++){
					finish = finish && statuses[i] == Thread.State.TERMINATED;
				}
				
				
			}
			
		}
		
		
	}
	
	private static void printRunningThreadStatus(){
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("In the Anonymous runnable task");
				System.out.println(Thread.currentThread().getState());
				
			}
		});
		
		System.out.println(thread.getState());
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.getState());
	}
	
}
