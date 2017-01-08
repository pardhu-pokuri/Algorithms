package threads_ch1;

public class ExceptionsInThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					System.out.println("Sleeping");
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Done Sleeping");
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				Integer.parseInt("TTT");
			}
		});
		
		t2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getId() + " " + e.getMessage());
			}
		});
		t1.start();
		t2.start();
	}

}
