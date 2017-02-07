package com.lambdas;

import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		/*
		 * System.out::println is equivalent to (p) -> System.out.println(p)
		 * Here lambda expression accepts a paramter and the same paramter is passed to println method. It is just a pass through of argument to println method.
		 * So this can be replaced with method reference.
		 * 
		 *  In general (p) -> method(p) lambda expression can be replaced with ContainingClass::method
		 */
		System.out.println("Printing All persons");
		performConditionally(people, (person) -> true, System.out::println);
		
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if(predicate.test(person)){
				consumer.accept(person);
			}
		}
	}

}
