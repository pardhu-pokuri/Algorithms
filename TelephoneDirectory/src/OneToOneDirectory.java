import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OneToOneDirectory {

	public static void main(String args[]) {

		ArrayList<String> entries = loadInput();
		HashMap<String, Integer> directoryMap = buildDirectory(entries);

		Scanner sc = new Scanner(System.in);
		String nameKey = sc.nextLine();
		System.out.println(nameKey + " : " + directoryMap.get(nameKey.toLowerCase()));
		
	}
	
	/**
	 * constructs a directory map from input 
	 * 
	 */
	private static HashMap<String, Integer> buildDirectory(ArrayList<String> entries) {
		HashMap<String, Integer> directoryMap = new HashMap<String, Integer>();
		for (String entry : entries) {
			String[] words = entry.split(":");
			directoryMap.put(words[0].toLowerCase(), Integer.valueOf(words[1]));
		}
		return directoryMap;
	}

	/**
	 * constructs a list that contains names and numbers.
	 * 
	 */
	private static ArrayList<String> loadInput() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sanjay:2232323");
		list.add("aarya:2432523");
		list.add("Sandhya:2234262");
		list.add("priya:2234535");
		return list;
	}

}
