package practice.mine;

public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] str) throws InterruptedException {
		
		Thread t = new Thread("Hanvitha"){
			
			@Override
			public void run() {
				System.out.println("TESTING" + " " + Thread.currentThread().getName());
			}
		};
		t.start();
		Thread.sleep(1000);
		System.out.println("i am done");
		System.out.println("i am done");System.out.println("i am done");
		System.out.println("i am done");System.out.println("i am done");
		System.out.println("i am done");System.out.println("i am done");
		
	 }


}
