package practice.mine;

public class DutchNationalFlag {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1,2,0,1,2,0,0,0,1,1,1,2,2,0,1,2,1,0,0,1,1};
		
		int first = 0;
		int mid = 0;
		int last = array.length-1;
		
		while(mid < last){
			
			if( array[mid] == 0){
				swap(array,first,mid);
				first++;
				mid++;
			}
			if( array[mid] == 1){
				mid++;
			}
			
			if(array[mid] == 2){
				swap(array,mid,last);
				last--;
			}
		}
		
		for(int i : array){
			System.out.print(i + " ");
		}
		
	}

	public static void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
