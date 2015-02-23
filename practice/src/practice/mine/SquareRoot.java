package practice.mine;

import java.util.Scanner;

public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		getSquareRootOfPerfectSquare();
	}
	
	public static void getSquareRootOfPerfectSquare(){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 1;
		int end = n;
		int middle = (start + end) / 2;

		for (;;) {
			if (middle * middle > n) {
				start = 1;
				end = middle;
				middle = (start + end)/2;
			}else if(middle * middle < n){
				start = middle;
				middle = (start + end)/2;				
			}else{
				System.out.println("Square root is :" + middle);
				break;
			}
			
		}
		sc.close();
	}

}
