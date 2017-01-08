package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8Consumer {

	
	public static void main(String[] args) {
		

		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		
		//Sort list by last name
		Collections.sort(people, (o1,o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		
		//print all the people
		System.out.println("Printing All persons");
		performConditionally(people, (person) -> true, (p) -> System.out.println(p));
		
		

		//print all people with last name beginning with C
		System.out.println("Printing All persons with lastname beginning with C");
		performConditionally(people, (person) -> person.getLastName().startsWith("C"), (p) -> System.out.println(p));


		//print all people with first name beginning with C
		System.out.println("Printing All persons with firstname beginning with C");
		performConditionally(people, (person) -> person.getFirstName().startsWith("C"), (p) -> System.out.println(p.getFirstName()));
		
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if(predicate.test(person)){
				consumer.accept(person);
			}
		}
		
	}
}
