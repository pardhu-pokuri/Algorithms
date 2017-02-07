package practice;

public class Summation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(findMax(2,54,9));
		System.out.println(findMax(2.9,5.4,9.9));
		System.out.println(findMax("abc","z","defg"));

	}
	
	public static <T extends Comparable<T>> T findMax(T arg0, T arg1, T arg2){
		
		T max = arg0;
		
		if(max.compareTo(arg1) < 0){
			max = arg1;
		}
		
		if(max.compareTo(arg2) < 0){
			max = arg2;
		}
		
		return max;
		
	}

}
