package practice.threads;

public class basicThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleThread runnable = new SimpleThread();
		Thread t = new Thread(runnable,"child");
		t.start();
		System.out.println("*************");
		t.run();
		System.out.println("*************");
		
	}

}

class SimpleThread implements Runnable{

	@Override
	public void run() {

		for(int i=0 ; i < 5 ; i++){
			System.out.println("Running "+Thread.currentThread().getName());
		}
		
	}
	
	
	
}