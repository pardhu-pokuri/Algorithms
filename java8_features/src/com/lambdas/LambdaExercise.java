package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {

	public static void main(String[] args) {
		
		
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				); 
		
		System.out.println(people);
		
		//sort list by name
		
		//Java7
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		System.out.println(people);
		
		//Java8
		Collections.sort(people, (o1,o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		System.out.println(people);
		
		
		//create a method that prints all element in the list
		
		//Java 7
		for (Person person : people) {
			System.out.println(person);
		}
		
		
		//Java 8
		iterateAndProcess(people, (person) -> System.out.println(person));
		
		
		//create a method that prints all people that have last name beginning with C
		//Java 7
		for (Person person : people) {
			if(person.getFirstName().startsWith("C")){
				System.out.println(person);
			}
		}
		
		//Java 8
		iterateAndProcess(people, (person) ->{
			if(person.getFirstName().startsWith("C")){
				System.out.println(person);
			}
		});
	}
	
	
	private static void iterateAndProcess(List<Person> persons, PersonProcessor processor){
		for (Person person : persons) {
			processor.processPerson(person);
		}
	}
	
	@FunctionalInterface
	interface PersonProcessor{
		
		public void processPerson(Person person);
	}

}
