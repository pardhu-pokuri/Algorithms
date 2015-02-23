package practice;

public class linearEquation {

	/**
	 * @param args
	 */
	
	public static final int SUM = 9;
	public static final int NUM_OF_VARS = 3;
	public static final int MIN = 1;
	public static final int MAX = 7;
	public static void main(String[] args) {
		findSolutions(0,0,"");
	}
	
	public static void findSolutions(int n, int sum , String solution){
		
		if( n > NUM_OF_VARS){
			return;
		}
		
		if( n == NUM_OF_VARS){
			if(sum == SUM){
				System.out.println(solution);
			}
		}
		
		for(int i = MIN ; i <= MAX ; i++){
			findSolutions(n+1,sum+i,solution+i);
		}
		
		
	}

}
