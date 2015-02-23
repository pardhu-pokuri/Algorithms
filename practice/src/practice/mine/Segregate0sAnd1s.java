package practice.mine;

public class Segregate0sAnd1s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,0,0,0,1,0,1,0,1,1,1,0,0,0,1};
		
		int first = 0;
		int last = array.length-1;
		
		while( first < last){
			
			if(array[first] == 0){
				first++;
			}
			
			if(array[last] == 1){
				last--;
			}
			
			if(array[first] == 1 && array[last] == 0){
				array[first] = 0;
				array[last] = 1;
				first++;
				last--;
			}
		}
		
		for(int i : array){
			System.out.print(i + " ");
		}
		
	}

}
