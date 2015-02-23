package practice.sortings;

public class BubbleSort {

	/**.
	 * @param args
	 */
	public static void main(String[] args) {

		bubbleSort(new int[]{18,2,13,4});
		
	}
	
	
	/**
	 * In ever go, scan thru the elements and swap the elements which are greater.
	 * 
	 * At the end of each iteration, biggest element will be pushed to end. 
	 * 
	 * @param array
	 */
	public static void bubbleSort(int[] array) {

		int n = array.length;

		for (int i = 0; i < n; i++) {

		
			for (int j = 0; j < n - i - 1; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int entry : array){
		System.out.print(entry+ " ");
		}

	}

}
