package com.lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		int key = 0;
		
		/* This could throw an exception if j is zero*/ 
		processNumbers(numbers,key, (i,j) -> System.out.println(i / j));
		
		/*  It is not an ideal way as lambda is not short and crisp by adding a try catch block*/
		processNumbers(numbers,key, (i,j) -> {
			try{
				System.out.println(i / j);
			}catch(ArithmeticException e){
				System.out.println("A exception occured");
			}
		});
		
		/* one of the ideal ways to handle exception so that lambda would be concise */
		/* The wrapper lambda wraps the passed lambda inside another lambda and returns it with additional functionality,
		   This is like embedding code into another piece of code like ruby yield (similar to within_frame_fixed)*/
		processNumbers(numbers,key, wrapperLambda((i,j) -> System.out.println(i / j)));
		
	}

	private static void processNumbers(int[] numbers, int key, BiConsumer<Integer, Integer> biconsumer) {
		for (int i : numbers) {
			//we cannot handle exception here as incoming lambdas can throw different types of exception for each lambda
			//and we cannot have a big catch block with all probable exception types.
			biconsumer.accept(i, key);;
		}
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (a ,b ) -> {
			try{
				//don't confuse. Here we are not executing the passed lambda, we are stuffing it in another lambda
				consumer.accept(a, b);
			}catch(ArithmeticException e){
				System.out.println("Exception Occured in wrapped lambda");
			}
		};
	}

}
