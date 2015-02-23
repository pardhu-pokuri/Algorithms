package practice;

public class MergeLargeSmall {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		int[] first = {1,2,6,9,10};
		int[] second = {3,4,5,7,8};
		int[] merge = new int[10];
		
		int i = 0,j = 0;
		int k = 4,l = 4;
		int index=0;
		
		while(i <= k && j <= l){
			
			if(first[i] < second[j]){
				merge[index++] = first[i];
				i++;
			}else{
				merge[index++] = second[j];
				j++;
			}
			
			if(first[k] > second[l]){
				merge[index++] = first[k];
				k--;
			}else{
				merge[index++] = second[l];
				l--;
			}
		}
		
		if(i <= k){
			merge[index++]=first[i];
			merge[index++]=first[k];
			i++;k--;
		}
		
		if(j <= l){
			merge[index++]=first[j];
			merge[index++]=first[l];
			j++;l--;
		}
		
		for(int h = 0 ; h < 10 ; h++){
			System.out.print(merge[h]);
		}
		
		
	}

}
