package practice;

public class IntersectionOfTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr1 = new int[]{1,5,10,20,40,80};
		int[] arr2 = new int[]{6,7,20,80,100};
		
		Intersection(arr1, arr2);
	}
	
	/**
	 *  Time: 0(n1+n2)
	 *  
	 *  where n1 and n2 are length of arrays.
	 * @param arr1
	 * @param arr2
	 */
	public static void Intersection(int[] arr1, int[] arr2){
		
		int p1 = 0;
		int p2 = 0;
		
			while(p1 < arr1.length){
			if(arr1[p1] == arr2[p2]){
				System.out.print(arr1[p1] + " ");
				p1++;
				p2++;
			}else if(arr1[p1] > arr2[p2]){
				p2++;
				
			}else{
				p1++;
			}
			
			
		}
		
	}

}
