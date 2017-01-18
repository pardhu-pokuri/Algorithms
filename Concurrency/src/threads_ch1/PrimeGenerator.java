package threads_ch1;

/**
 * 
 * Generates Prime numbers until the thread is interrupted.
 * A Java program finishes when all of its non daemon threads gets finished. Sometimes you may want to stop one of the threads.
 * Java provides a interruption mechanism to do this. When you call a interrupt() method on a thread, it sets a variable to true inside thread object.
 * So you can have a condition using isInterrupted() method in your task and can stop the further execution of thread.
 *
 *	The Thread class has another method to check whether Thread has been interrupted or not.
 *  It's the static method, interrupted(), that checks whether the current executing thread
 *  has been interrupted or not.
 *
 */
public class PrimeGenerator extends  Thread{

	
	@Override
	public void run() {
		
		long number = 1L;
		while(true){
			
			if(isPrimeNumber(number)){
				System.out.printf("%d is a prime\n", number);
			}
			
			if(isInterrupted()){
				System.out.println("PrimeGenerator has been interupted");
				return;
			}
			number++;
		}
		
		
	}
	
	private boolean isPrimeNumber(long number){
		
		if(number == 1){
			return false;
		}
		
		if(number == 2){
			return true;
		}
		
		for(int i = 2 ; i < number ; i ++){
			if(number % i == 0){
				return false;
			}
		}
		
		return true;
	}
	

}
