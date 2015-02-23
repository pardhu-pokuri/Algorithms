package practice;

public class printPathsInMatrix {

	/**
	 * @param args
	 */
	
	public static final int ROW_LEN = 2;
	public static final int COL_LEN = 3;
	
	
	public static void main(String[] args) {

		int[][] array = {{1,2,3},{4,5,6}};
		printAllPaths(array, 0, 0, "");
	}
	
	public static void printAllPaths(int[][] array, int i , int j, String path){
		
		if(i == ROW_LEN-1 && j == COL_LEN-1){
			System.out.println(path+array[i][j]);
		}
		if(i > ROW_LEN-1 || j > COL_LEN-1){
			return;
		}
		printAllPaths(array, i+1, j,path+array[i][j]);
		printAllPaths(array, i, j+1,path+array[i][j]);
	}

}
