package com.lambdas;

public class Greeter {

	public static void main(String[] args) {

		Greeting anonymousGreeting = new Greeting() {
			@Override
			public void greet(String message) {
				System.out.println(message);
			}

		};

		Greeting lambdaGreeting = (String s) -> {
			System.out.println(s);
		};

		anonymousGreeting.greet("Anonymous greeting");
		lambdaGreeting.greet("lambda Greeting!!!");

	}

}
