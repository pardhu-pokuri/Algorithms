package practice.mine;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class FirstNonRepeatingCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findNthNonRepeatingCharacter("this is parthu", 0));
		
		
	}
	
	
	public char firstNonRepeating(String string){
		char[] charArray = string.toCharArray();
		HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < charArray.length ; i++){
			char c = charArray[i];
			if(charMap.containsKey(c)){
				charMap.put(c, charArray.length * 2);
			}
			else{
				charMap.put(c, charArray.length * 2);
			}
		}
		
		Collection<Integer> values = charMap.values();
		Object[] array = values.toArray();
		return ' ';
	}
	
	
	public static char findNthNonRepeatingCharacter(String string, int n){
		
		LinkedList<Character> charList = new LinkedList<Character>();
		//boolean[] nonRepeated = new boolean[256];
		
		for(char c : string.toCharArray()){
			if(charList.contains(c)){
				charList.remove(new Character(c));
			}else{
				charList.add(c);
			}
		}
		return charList.get(0);
	}

}
