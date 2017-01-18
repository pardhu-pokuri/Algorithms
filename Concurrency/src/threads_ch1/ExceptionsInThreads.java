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
		
		/**
		 * As run method doesn't have throws clause. We need to catch all the checked exceptions in the run method itself.
		 * If an exception occurs at runtime, we can catch it through Exception Handler. We can set an ExceptionHandler to thread object.
		 * An exception handler can be defined at three levels
		 * 1) Thread object level
		 * 2) Thread group level
		 * 3) Thread class level.
		 * If an exceptionhandler is found in the thread object, it will be executed. If it is not found, then it will check for
		 * exception handler in threadgroup object. If it is not found in thread group, it will check for static exception handler defined at Thread class level.   
		 */
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
