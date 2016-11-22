package threads;

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
