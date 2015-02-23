package practice.sortings;

public class InsertionSort {

	/**
	 * Bubble Sort
	 * Shell Sort
	 * 
	 * Insertion Sort
	 * Selection Sort
	 * 
	 * Merge Sort
	 * Quick Sort
	 * Heap Sort
	 * 
	 * Counting Sort
	 * Bucket Sort
	 * Radix Sort
	 * 
	 * Numerical Ordering and Lexicographical Ordering
	 * Exchange sorts, Selection sorts,  Serial and parallel algorithms 
	 */
	public static void main(String[] args) {

		int[] array = {12,5,2,0,4,6,1,3};
		sort_Insertion(array);

	}
	
	public static void sort_Insertion(int[] array){
		int n = array.length;
		
		for(int i = 1 ; i < n ; i++)
		{
			int key = array[i];
			int j;
			for(j = i-1 ; j >= 0 && array[j] > key ; j--){
					array[j+1] = array[j];
			}
			array[j+1] = key;
			
		}
		
		for(int k = 0 ; k < array.length ; k++){
			System.out.print(array[k] + " , ");
		}
	}

}
