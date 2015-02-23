package practice.mine;

public class transposematrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int SIZE = 3;
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		//transpose
/*		
		for(int i = 0 ; i < SIZE ; i++){
			for(int j = 0 ; j < SIZE ; j++){
				if(i != j && i < j){
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}
		}
		//swapping columns after transposing -> transpose + swapping columns = rotating 90 degrees
		for(int i = 0 ; i < SIZE/2 ; i++){
			for(int j = 0 ; j < SIZE ; j++){
					int temp = array[j][i];
					array[j][i] = array[j][SIZE-i-1];
					array[j][SIZE-i-1] = temp;
			}
		}*/
		
		System.out.println();
		
		
		//only printing: rotating directly
		for(int i = 0 ; i < SIZE ; i++){
			for(int j = 0 ; j < SIZE ; j++){
					System.out.print(array[SIZE-j-1][i] + " ");
			}
			System.out.println();
		}
		
		/*for(int i = 0 ; i < SIZE ; i++){
		for(int j = 0 ; j < SIZE ; j++){
			if((i == j) || (i < j)){
				int temp = array[i][j];
				array[i][j] = array[j][SIZE-i-1];
				array[j][SIZE-i-1] = temp;
			}
		}*/
		
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}


}
