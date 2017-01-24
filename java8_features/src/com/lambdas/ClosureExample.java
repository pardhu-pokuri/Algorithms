package com.lambdas;

public class ClosureExample {

	
	public static void main(String[] args) {
		
		int a = 10;
		/**
		 * When we use a variable in the anonymous inner class which is in other scope. It has to be final.
		 * Here variable 'a' is in the scope of main method. This variable is used in process method of
		 * anonymous inner class. But the process method is not going to get executed in main method. It is going to be
		 * executed in the scope of doProcess method. But 'a' will not be available in the scope of doProcess(). So 'a' has to treated as a constant
		 * and should be made final. From Java8 compiler assumes such variables as final implicitly and we don't need to mark 'a' as final.
		 * But if we change the value of 'a' in the anonymous inner class,it throws compilation error.
		 * 
		 * So the same logic applies to lambda expression as well.   
		 * 
		 */
		doProcess(2, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i + a);
				
			}
		});
		
		/**
		 * Lambda expression gets executed in the scope of doProcess() method. So 'a' will be treated as final.
		 */
		doProcess(3, i -> System.out.println(i + a));
		
	}
	
	public static void doProcess(int i ,Process p){
		p.process(i);
	}
	
}

