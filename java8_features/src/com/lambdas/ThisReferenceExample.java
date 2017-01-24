package com.lambdas;

public class ThisReferenceExample {

	public static void main(String[] args) {
		
		ThisReferenceExample example = new ThisReferenceExample();
		example.doProcess(2, new Process() {
			
			@Override
			public void process(int i) {
				
				System.out.println(i);
				//here the 'this' referes to Process object. 
				System.out.println(this);
				
			}
			
			@Override
			public String toString() {
				return "inside anonymous class";
			}
		});
		
		/**This will not work because, In lambdas this reference is same as
		* or equal to this reference outside lambda.
		* As 'this' outside in lambda is in static context, it doesn't work.
		* example.doProcess(4, (i) -> System.out.println(this));
		*/
		example.execute();
		
	}

	public void doProcess(int i , Process process){
		process.process(i);
		
	}
	
	public void execute(){
		/*
		 *This works because 'this' outside lambda is a valid context. 
		 */
		doProcess(4, (i) -> System.out.println(this));
	}
	
	@Override
	public String toString() {
		return "inside ThisReferenceExample class";
	}
}
