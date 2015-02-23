package barclaysTest;

public class StepsForZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution("11110");
		
	}
	
	public static int solution(String S) {
        char[] charArray = S.toCharArray();
        int coef = 1;
        int number = 0;
        
        for(int i = charArray.length - 1 ; i >= 0 ; i--){
        	
        	char c = charArray[i];
        	
        	if(c == '1'){
        		number = number + (coef*1);
        	}
        	
        	coef = coef * 2;
        }
        
        int count = 0;
        while(number != 0){
        	if(number % 2 == 0){
        		number = number / 2;
        	}else{
        		number--;
        	}
        	count++;
        }
     
     return count;   
    }

}
