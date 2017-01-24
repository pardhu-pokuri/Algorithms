package com.lambdas;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
			
		Thread t = new Thread(() -> printMessage());
		t.start();
		
		/*
		 * () -> printMessage() can be replaced with MethodReferenceExample1::printMessage
		 * 
		 * Here lambda doesn't accept any arguments and printMessage() method also doesn't accept any arguments. Hence we can refer the method directly.
		 * 
		 * In general , lambda expression () -> method() can be replaced with ContainingClass::method
		 * 
		 */
		
		Thread t1 = new Thread(MethodReferenceExample1::printMessage);
		t1.start();
		
		MethodReferenceExample1 example = new MethodReferenceExample1();
		Thread t2 = new Thread(example::printMessage1);
		t2.start();
	}
	
	public static void printMessage(){
		System.out.println("Hello!");
	}

	public void printMessage1(){
		System.out.println("Hello!");
	}

}
