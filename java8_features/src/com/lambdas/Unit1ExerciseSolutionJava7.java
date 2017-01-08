package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		

		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		
		//Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		
		//print all the people
		System.out.println("Printing All persons");
		printAll(people);
		
		

		//print all people with last name beginning with C
		System.out.println("Printing All persons with lastname beginning with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("C");
			}
		});


		//print all people with first name beginning with C
		System.out.println("Printing All persons with firstname beginning with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("C");
			}
		});
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)){
				System.out.println(person);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}
	
	interface Condition{
		boolean test(Person person);
	}

}
