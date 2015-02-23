package practice.mine;

public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] array = "abc".toCharArray();
		permute(array,0,2);
	}
	
	static void permute(char[] a, int i, int n) 
	{	   int j; 
	   if (i == n)//{}
	     System.out.println(a);
	   else
	   {
	        for (j = i; j <= n; j++)
	       {
	          //swap(a[i], a[j]);
	        	char temp = a[j];
	    		a[j] = a[i];
	    		a[i] = temp;

	    		permute(a, i+1, n);
	          //swap(a[i], a[j]);

	    		char temp1 = a[j];
	    		a[j] = a[i];
	    		a[i] = temp1;
	    		System.out.print("*****");
	    		System.out.println(a);
	       }
	   }
	}
	
	static void swap(char a, char b){
		char temp = a;
		a = b;
		b = temp;
	}

}
