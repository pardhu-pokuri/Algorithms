package hackerrank;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoveLetterMystery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	/*	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		
		String[] inputs = new String[n];
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		for(int i = 0 ; i < n ; i++){
			try {
				inputs[i] = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0 ;i < n ; i++){
			System.out.println(minOperations(inputs[i]));
		}*/
		
		 		        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] inputs = new String[n];
		sc.nextLine();
		for(int i = 0 ; i < n ; i++){
			if(sc.hasNext()){
				inputs[i] = sc.nextLine();
			}
                
		}
		
		for(int i = 0 ;i < n ; i++){
              System.out.println(minOperations(inputs[i]));    
		}
	}
	
	public static boolean isPalindrome(char[] str){
		
		int start = 0;
		int end = str.length - 1;
		
		while(start < end){
			
			if(str[start] == str[end]){
				start++;
				end--;
			}else{
				return false;
			}
			
		}
		
		return true;
	}
	
	public static int minOperations(String str){
		
		char[] input = str.toCharArray();
		int operations = 0;
		int start = 0;
		int end = input.length -1 ;
		
		while(start < end){
			
			if(input[start] == input[end]){
				
			}else if(input[start] > input[end]){
				operations  += input[start] - input[end];
			}else{
				operations  += input[end] - input[start];
			}
			start++;
			end--;
		}
		
		
		return operations;
	}
	

}
