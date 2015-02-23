package practice;

public class CountAndSay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1 11 21 1211 111221
		
		String input = "1";
		int n = 5;
		while (n > 0) {
			int count = 1;
			char element = input.charAt(0);
			String str = "";
			for (int i = 1; i < input.length(); i++) {
				if(input.charAt(i) == element){
					count++;
				}else{
					str = str+""+count+""+element;
					count = 1;
					element = input.charAt(i);
				}
			}
			str = str+""+count+""+element;
			System.out.println(str);
			input = str;
			n--;
		}
		
		
	}

}
