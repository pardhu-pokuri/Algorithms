package practice;

public class integerPartitions {

	/**
	 * @param args
	 */
	
	public static final int MAX_SUM = 4;
	public static final int MIN = 1;
	public static final int MAX = MAX_SUM;
	public static void main(String[] args) {
		findSolutions(0,"");
	}
	
	public static void findSolutions(int sum , String solution){
			if(sum > MAX_SUM){
				return;
			}
			if(sum == MAX_SUM){
				System.out.println(solution);
				return;
			}
		for(int i = MIN ; i <= MAX_SUM ; i++){
			findSolutions(sum+i,solution+i);
		}
		
		
	}

}
