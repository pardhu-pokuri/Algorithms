package practice;

import java.util.HashMap;
import java.util.Map;

public class SudokuValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//HashMap<Integer,Integer>[] array = (Map<Integer,Integer>[]) new HashMap[9];
		
		HashMap[] rows = new HashMap[9];
		HashMap[] columns = new HashMap[9];
		HashMap[] boxes = new HashMap[9];
		
		for(int i = 0 ; i < 9 ; i++){
			rows[i] = new HashMap<Integer,Integer>();
			columns[i] = new HashMap<Integer,Integer>();
			boxes[i] = new HashMap<Integer,Integer>();
		}
		
		int[][] sudoku = {
				{7, 5, 1,  8, 4, 3,  9, 2, 6},
				{8, 9, 3,  6, 2, 5,  1, 7, 4}, 
				{6, 4, 2,  1, 7, 9,  5, 8, 3},
				{4, 2, 5,  3, 1, 6,  7, 9, 8},
				{1, 7, 6,  9, 8, 2,  3, 4, 5},
				{9, 3, 8,  7, 5, 4,  6, 1, 2},
				{3, 6, 4,  2, 9, 7,  8, 5, 1},
				{2, 8, 9,  5, 3, 1,  4, 6, 7},
				{5, 1, 7,  4, 6, 8,  2, 3, 9}
				};
		
		for(int i =0 ; i < 9 ; i++){
			for(int j = 0 ; j < 9 ; j++){
				
				if(rows[i].get(sudoku[i][j]) != null || columns[j].get(sudoku[i][j]) != null || boxes[getRelevantBox(i, j)].get(sudoku[i][j]) != null){
					System.out.println("its invalid");
					break;
				}else{
					rows[i].put(sudoku[i][j],1);
					columns[j].put(sudoku[i][j],1);
					boxes[getRelevantBox(i, j)].put(sudoku[i][j], 1);
				}
				
			}
		}
		
		/**
		00 01 02 03 04 05 06 07 08
		10 11 12 13 14 15 16 17 18
		20 21 22 23 24 25 26 27 28
		
		30 31 32 33 34 35 36 37 38
		40 41 42 43 44 45 46 47 48
		50 51 52 53 54 55 56 57 58
		
		60 61 62 63 64 65 66 67 68
		70 71 72 73 74 75 76 77 78
		80 81 82 83 84 85 86 87 88
		**/
		
		
		
		
		
	}
	
	public static int getRelevantBox(int i , int j){
		
		int temp_i = i/3;
		int temp_j = j/3;
		
		return temp_j + temp_i * 3 ;
		
		
	}

}
