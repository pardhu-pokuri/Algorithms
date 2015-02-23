package practice.mine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * problem from
 * 
 * http://www.learnalgorithms.in/practice/reverse_add.php
 * 
 * 
 */

public class ReverseSumPalindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		scanner.close();
		for (Integer item : list) {
			reverseSum(item);
		}
	}

	public static int reverseNumber(int n) {
		int reverse = 0;
		int temp = n;
		while (temp != 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp = temp / 10;
		}
		return reverse;
	}

	public static void reverseSum(int n) {
		int sum = n;
		for (int i = 0;; i++) {
			int reverse = reverseNumber(sum);
			// System.out.println(sum);
			// System.out.println(reverse);
			if (sum == reverse) {
				// System.out.println("Final Palindrome number is: " + sum);
				// System.out.println("No of iterations: " + i);
				System.out.println(i + " " + sum);
				break;
			}
			sum = sum + reverse;
		}

	}
}
