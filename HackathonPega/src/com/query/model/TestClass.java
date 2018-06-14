package com.query.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.Locale;

public class TestClass {
	
	public static final String CLASS = "class";
	public static final String EXTENDS = "extends";
	public static final String PROPERTY = "property";
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\pokup\\Documents\\My Received Files\\model.txt";
		Locale locale = Locale.US;
		BreakIterator breakIterator =
		        BreakIterator.getWordInstance(locale);

/*		breakIterator.setText(
		        "Mary had a little Android device.\n " +
		        "It had small batteries too.");*/
		
		String fileContent = readFile(filePath);
		breakIterator.setText(fileContent);

		int start = breakIterator.first();
		int end = breakIterator.next();
		String context = null;
		while(start != BreakIterator.DONE && end != BreakIterator.DONE) {
		    //System.out.println("start:" + start) ;
		    //System.out.println("end:" + end);
		    String substring = fileContent.substring(start, end).trim();
		   
			if (CLASS.equals(substring)) {
				context = CLASS;
			}else if (EXTENDS.equals(substring)) {
				context = EXTENDS;
			}else if (isProperty(substring)){
				context = PROPERTY;
			}

			System.out.println(substring);
		    	
		    start = end;
		    end = breakIterator.next();
		}
		
	}
	
	private static boolean isProperty(String substring) {
		return "INT".equals(substring) || "STRING".equals(substring) || "DOUBLE".equals(substring) || "SUMOF".equals(substring);
	}

	private static String readFile(String filePath) throws IOException {
		StringBuilder builder = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(filePath));){
			String eachLine = null;
			while((eachLine = br.readLine()) != null){
				builder.append(eachLine);
				builder.append("\n");
			}
		}
		return builder.toString();
	}
	

}
