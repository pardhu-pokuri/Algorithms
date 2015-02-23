package practice;

public class printBraces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printValidBraces(3, 3, "");
	}

	public static void printValidBraces(int open, int closed, String brace){
		
		if(open < 0 || closed < 0){
			return;
		}
		if(open == 0 && closed == 0){
			System.out.println(brace);
			//return;
		}else{
			if (open > 0) {
				printValidBraces(--open, closed, brace + "(");
			}

			if (closed > open) {
				printValidBraces(open, --closed, brace + ")");
			}
		}
	} 
}	
