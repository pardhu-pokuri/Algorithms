package com.lambdas;

import java.util.function.Predicate;

public class NestedPredicate {
	
	public static void main(String[] args) {
		Predicate<Integer> myPredicate = (i -> i <= 5) ;
		System.out.println(myPredicate.test(2));
		System.out.println(myPredicate.and(i -> i >= 1).test(6));
	}
}
