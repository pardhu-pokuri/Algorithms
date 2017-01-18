package threads_ch1;

import java.util.Random;

public class ThreadGroupExceptionExample {

	public static void main(String[] args) {
		
		
		ThreadGroup group = new ThreadGroup("mythreadgroup"){
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Caught Exception for thread " + t.getName());
				e.printStackTrace(System.out);
				System.out.println("Terminating rest of threads");
				interrupt();
			}
			
		};
		
		Runnable task = new Runnable(){
				@Override
				public void run() {
					int result;
					Random random = new Random(Thread.currentThread().getId());
					
					while(true){
						result = 1000/(int)(random.nextDouble() * 1000);
						System.out.printf("%s : %d\n", Thread.currentThread().getName(), result);
						if(Thread.currentThread().isInterrupted()){
							System.out.println(Thread.currentThread().getName() + "is interrupted");
							return;
						}
						
					}
					
				}
		};
		
		/*
		 * Here no uncaughExceptionHandler is defined for the thread at its object level, So uncaughExceptionHandler defined at group level will be executed.
		 */
		for(int i = 0 ; i < 3 ; i++){
			Thread thread = new Thread(group,task);
			thread.start();
		}
		
	}

}
