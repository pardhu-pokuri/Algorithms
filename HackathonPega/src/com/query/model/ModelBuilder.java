package com.query.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelBuilder {
	
	public Map<String,ClassModel> buildModel(String filePath) throws IOException{
		Map<String,ClassModel> classModels = new HashMap<>();
		List<String> classes = extractClasses(filePath);
		for (String eachClass : classes) {
			ClassModel model = buildModelForEachClass(eachClass);
			classModels.put(model.className(), model);
		}
		return classModels;
	}

	private ClassModel buildModelForEachClass(String eachClass) {
		return null;
	}

	private List<String> extractClasses(String filePath) throws IOException {
		String fileContent = readFile(filePath);
		BreakIterator lineInstance = BreakIterator.getLineInstance();
		lineInstance.setText(fileContent);
		
		
		return null;
	}

	private String readFile(String filePath) throws IOException {
		StringBuilder builder = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(filePath));){
			String eachLine = null;
			while((eachLine = br.readLine()) != null){
				builder.append(eachLine);
			}
		}
		return builder.toString();
	}
	
}
