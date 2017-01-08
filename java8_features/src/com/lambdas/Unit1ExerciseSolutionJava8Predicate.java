package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8Predicate {

	
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
		printConditionally(people, (person) -> true);
		
		

		//print all people with last name beginning with C
		System.out.println("Printing All persons with lastname beginning with C");
		printConditionally(people, (person) -> person.getLastName().startsWith("C"));


		//print all people with first name beginning with C
		System.out.println("Printing All persons with firstname beginning with C");
		printConditionally(people, (person) -> person.getFirstName().startsWith("C"));
		
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if(predicate.test(person)){
				System.out.println(person);
			}
		}
		
	}
}
