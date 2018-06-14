package datatypes;

public class SumofTwo {
	
/*	public static double add(int a, int b){
		return a + b;
	}
	
	public static double add(float a, float b){
		return a + b;
	}
	
	public static double add(double a, double b){
		return a + b;
	}*/
	
	public static <T extends Number> double add(T a, T b){
		return a.doubleValue() + b.doubleValue();  
	}
	
	public static void main(String[] args) {
		System.out.println(SumofTwo.<Integer>add(2, 3));
		System.out.println(SumofTwo.<Float>add(2.0f, 3.0f));
		System.out.println(SumofTwo.<Double>add(2.0, 3.0));
	}
	
	public static <T extends Comparable<T>> T findMaximum(T a, T b, T c){
		T max = null;
		
		if(a.compareTo(b) > 0){
			max = a;
		}else{
			max = b;
		}
		
		if(max.compareTo(c) < 0){
			max = c;
		}
		
		return max;
	}
	
	
}
