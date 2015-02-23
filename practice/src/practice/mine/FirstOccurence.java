package practice.mine;

public class FirstOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] input = {0,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2};
		
		int lower = 0;
		int upper = 13;
		int middle = 0;// = (lower + upper)/2;
		int result = -1;
		while(lower <= upper){
			middle = (lower + upper)/2;

			if(input[middle] == 1){
				lower = middle + 1;
				result = middle;
			}else if(input[middle] == 0){
				lower = middle + 1;
			}
		}

		System.out.println(result);
	}

}
