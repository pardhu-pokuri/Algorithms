package swiping;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class SwipeData {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		
		SwipeData data = new SwipeData();
		//data.loadData();
		
		List<Entry> entries = new ArrayList<>();
		entries.add(new Entry(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2016-12-20 12:10:00"),"L"));
		entries.add(new Entry(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2016-12-20 12:20:00"),"A"));
		entries.add(new Entry(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2016-12-20 12:22:00"),"A"));
		entries.add(new Entry(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2016-12-20 12:24:00"),"A"));
		entries.add(new Entry(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2016-12-20 12:26:00"),"L"));
		entries.add(new Entry(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2016-12-20 12:28:00"),"A"));
		
		Date timestamp = null;
		for (Entry entry : entries) {
			if(entry.getType().equals("L")){
				entry.setDelta(0);
				timestamp = entry.getTimeStamp();
			}else{
				entry.setDelta(entry.getTimeStamp().getTime() - timestamp.getTime());
			}
			
		}
		
		for (Entry entry : entries) {
			System.out.println(entry.getDelta()/1000);
		}
	}
	
	
	public void loadData() throws IOException{
		
		HashMap<String, HashMap<String, HashMap<String, List<Entry>>>> data = new HashMap<String, HashMap<String, HashMap<String, List<Entry>>>>(); 
		
		FileReader fr = new FileReader("\\logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line  = br.readLine()) != null ){
			String[] split = line.split(",");
			String user = split[0];
			String date = split[1];
			String timestamp = split[1] + " " + split[2];
			
		}
		
	}

}
