package practice.mine;

public class LCS {

	/**
	 * @param args
	 */
	
	public static String lcs = "";
	
	public static void main(String[] args) {

		int count = LCS_length("AGGTAB".toCharArray(), 0, "GXTXAYB".toCharArray(), 0);
		System.out.println(count + "--" + lcs);
	}
	
	public static int LCS_length(char[] X,int i ,char[] Y, int j){
		
		if(i >= X.length || j >= Y.length){
			return 0;
		}
		
		if(X[i] == Y[j]){
			return 1+ LCS_length(X, i+1, Y, j+1);
		}else{
			return Math.max(LCS_length(X, i+1, Y, j), LCS_length(X, i, Y, j+1));
		}
	}
	

}
