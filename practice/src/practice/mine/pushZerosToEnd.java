package practice.mine;

public class pushZerosToEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		int i = 0;
		for(int j = 0 ; j < array.length ; j++){
			if(array[j] != 0){
				array[i] = array[j];
				i++;
			}
		}
		
		while(i < array.length){
			array[i++] = 0;
		}
		
		for(int k : array){
			System.out.print(k+" ");
		}
	}
	

}
