package practice;

import java.util.HashMap;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println(runCustomerSimulation(2, "abbajjkzkz"));
		System.out.println(runCustomerSimulation(3, "gaccbddbagee"));
		System.out.println(runCustomerSimulation(3, "gaccbgddbaee"));
		System.out.println(runCustomerSimulation(1, "abcbca"));
		char xxx = 'a' + 'b';
		System.out.println('a'+1);
		System.out.println(xxx);
		int a[] = new int[0];
		StringBuilder[] x = new StringBuilder[0]; 
		System.out.println(x.length);
		boolean k = false;
		boolean b = false;
		if(b = k){
			
		}
		
		if(false);else;
	}
	
	public static int runCustomerSimulation(int num, String customers){
		
		HashMap<Character,Boolean> seating = new HashMap<Character, Boolean>();
		int count = 0;
		
		for(Character ch : customers.toCharArray()){
			
			if(seating.get(ch) != null){
				seating.remove(ch);
			}else{
				
				if(seating.size() >= num){
					count++;
				}else{
					seating.put(ch,true);
				}
			}
		}
		
		return count/2;
		
	}

}
