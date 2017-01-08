package com.lambdas;

public class TestExceptionHandler {

	public static void main(String a[]) throws InterruptedException {
		
		Runnable runnable = () -> {
			Integer.parseInt("TTT");
		};
		Thread t1 = new Thread(runnable);
		
		System.out.println(t1);
		System.out.println(t1.getThreadGroup());
		t1.start();
		
		t1.join();
		System.out.println("done");
	}
	
}
