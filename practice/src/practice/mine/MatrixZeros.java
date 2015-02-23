package practice.mine;

public class MatrixZeros {

	/**
	 * @param args
	 */
	
	public static final int NO_OF_COLUMNS = 3;
	public static final int NO_OF_ROWS = 4;
	public static void main(String[] args) {

		int[][] matrix = {{1,0,2},{8,9,7},{1,2,3},{1,2,1}};
		int[] row = new int[NO_OF_ROWS];
		int[] column = new int[NO_OF_COLUMNS];
		
		for(int i = 0 ; i < NO_OF_ROWS ; i++){
			for(int j = 0 ; j  < NO_OF_COLUMNS; j++){
				if(matrix[i][j] == 0){
					row[i] = 1;
					column[j] = 1;
				}
				
			}
		}
		
		for(int i = 0 ; i < NO_OF_ROWS ; i++){
			for(int j = 0 ; j  < NO_OF_COLUMNS; j++){
				if(row[i] == 1 || column[j] == 1){
					matrix[i][j] = 0;
				}
				
			}
		}
		
		for(int i = 0 ; i < NO_OF_ROWS ; i++){
			for(int j = 0 ; j  < NO_OF_COLUMNS; j++){
				System.out.print(matrix[i][j]);
			}
				System.out.println();
			}
		}
		
	}

