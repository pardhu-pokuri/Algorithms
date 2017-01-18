package threads_ch1;

public class PrimeGeneratorThreadsExecution {

	
	public static void main(String[] args) {
	
		Thread thread = new PrimeGenerator();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//interrupts a thread by setting a flag.
		thread.interrupt();

	}

}
