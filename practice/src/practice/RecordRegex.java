package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecordRegex {

	/**
	 * @param args
	 */
	
	public static final String recordFirstLineRegex = "(.*),\\\"(.*)\\\",\\\"(.*)\\\",\\\"(.*)";
	public static final String recordCommentsRegex = "Comments:(.*)";
	public static final String recordSubmitRegex = "submit:.*";
	
	
	public static void main(String[] args) {

		String date = "";
		String email = "";
		String portal = "";
		String comments = "";
		
		try {
			FileReader fr = new FileReader("C:/Users/KH1121/Downloads/record.txt");
			BufferedReader br = new BufferedReader(fr);
			
			Pattern patternFirstLine = Pattern.compile(recordFirstLineRegex);
			Pattern patternComments = Pattern.compile(recordCommentsRegex);
			Pattern patternSubmit = Pattern.compile(recordSubmitRegex);
			
			Matcher matcher;
			String line;
			boolean flag = true;
			while (flag) {
				while ((line = br.readLine()) != null) {
					matcher = patternFirstLine.matcher(line);
					if (matcher.matches()) {
						date = matcher.group(1);
						email = matcher.group(2);
						portal = matcher.group(3);
						break;
					}
				}
				if(line == null){
					break;
				}
				
				while ((line = br.readLine()) != null) {
					matcher = patternComments.matcher(line);
					if (matcher.matches()) {
						comments = matcher.group(1);
						break;
					}
				}

				if(line == null){
					break;
				}
				
				while ((line = br.readLine()) != null) {
					matcher = patternSubmit.matcher(line);
					if (matcher.matches()) {
						break;
					} else {
						comments = comments + "\n" + line;
					}
				}
				
				if(line == null){
					break;
				}
				System.out.println(date);
				System.out.println(email);
				System.out.println(portal);
				System.out.println(comments);

			}
				
			br.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
