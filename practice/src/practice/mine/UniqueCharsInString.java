package practice.mine;

public class UniqueCharsInString {

	/**
	 * @param args
	 */
	
	/**
	 * There are 256 ASCII characters. Earlier there were 128 chars and it was extended
	 * to 256. Some are control characters and some are printable chars, some extended chars.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "this pardhu";
		boolean isUnique= true;
		boolean[] ascii_chars = new boolean[256];
		for(int i = 0 ; i < string.length() ; i++){
			if(ascii_chars[string.charAt(i)]){
				isUnique = false;
				break;
			}else{
				ascii_chars[string.charAt(i)] = true;
			}
		}
		
		if(isUnique){
			System.out.println("Its unique");
		}else {
			System.out.println("Nope dude");
		}

	}

}
