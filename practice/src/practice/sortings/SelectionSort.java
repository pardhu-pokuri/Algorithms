package practice.sortings;

public class SelectionSort {

	public static void main(String[] args) {

		selectionSort(new int[] { 4, 11, 7, 9 });
	}

	public static void selectionSort(int[] array) {

		int n = array.length;
		for (int i = 0; i < n; i++) {
			int min = i;

			for (int j = i; j < n; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}

			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;

		}

		for (int entry : array) {
			System.out.print(entry + " ");
		}

	}

}
