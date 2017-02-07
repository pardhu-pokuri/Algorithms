package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IDMdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

	}
	
/*	public void modifyBulkUsers(){
		
		ArrayList<String> userIds = new ArrayList<String>();
		userIds.add("IDMUSR0");
		userIds.add("IDMUSR1");
		userIds.add("IDMUSR2");
		userIds.add("IDMUSR23");
		
		HashMap<String, String> attributes = new HashMap<String, String>();
		attributes.put("att1","val1");
		attributes.put("att2","val2");
		attributes.put("att3","val3");
		attributes.put("att4","val4");
		
		UserManagerResult result = modify(userIds, attributes, true);
		
		List<String> successIds = result.getSuccededResults();
		
		for(String id : successIds){
			System.out.println(id);			
		}
		
		Iterator<String> iterator = successIds.iterator();
		
		while(iterator.hasNext()){
			String id = iterator.next();
			System.out.println(id);
		}
	}
	
	public UserManagerResult modify(ArrayList<String> userIds, HashMap<String,String> attributes, boolean isUserLogin){
		
		
	}
*/	
	
	public void sample(){
		
		String filepath = "C:/work/logs.txt";
		
		try {
			//This line may throw FileNotFoundException, hence catching it
			FileReader fr1 = new FileReader(filepath); 
			BufferedReader br1 = new BufferedReader(fr1);
			String line;
			//This line may throw IOException, hence catching it
			while((line = br1.readLine()) != null){ 
				//Now process this line like the way you want.
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String[] array = new String[5];
		for(int i = 0 ;i < 5 ; i++){
			array[i] = "string" + i;
		}
		
		try {
			//This line may throw IOException
			FileWriter fw = new FileWriter(filepath);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0 ; i < 5 ; i++){
				bw.write(array[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//List<Integer> intList = new ArrayList<Integer>(); can be created like this as well
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(new Integer(16));
		intList.add(new Integer(10));
		intList.add(new Integer(23));
		intList.add(new Integer(9));
		
		//Removing on basis of object and index respectively
		intList.remove(new Integer(16));
		intList.remove(1);
		
		//Advanced For loop
		for(Integer i : intList){
			System.out.println(i*2);
		}
		
		//Iterator
		Iterator<Integer> myIterator = intList.iterator();
		while(myIterator.hasNext()){
			Integer value = myIterator.next();
			System.out.println(value*5);
		}
		
		
		//List<Integer> list = new LinkedList<Integer>(); can be created like this as well
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("pappu");
		myList.add("vi");
		myList.add("nuvvu");
		myList.add("he ha ha");
		
		//Removing on basis of object and index respectively
		myList.remove("he ha ha");
		myList.remove(1);
		
		//Advanced For loop
		for(String str : myList){
			System.out.println(str);
		}
		
		//Iterator
		Iterator<String> myStrIterator = myList.iterator();
		while(myStrIterator.hasNext()){
			String value = myStrIterator.next();
			System.out.println(value);
		}
		
		
		Map<String,String> myMap = new HashMap<String, String>();
		
		myMap.put(new String("key1"), new String("value1"));
		myMap.put("key1", "value1");
		myMap.put("key1", "value1");
		myMap.put("key1", "value1");
		
		//u cannot iterate over a map directly, u need to get a entryset first
		Set<Entry<String, String>> entrySet = myMap.entrySet();
		
		//iterating over entryset using advanced for loop
		for (Entry<String, String> entry : entrySet) {
			System.out.println("this key : " + entry.getKey() + "has a value " + entry.getValue());
		}
		
		//using iterator over entrySet
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, String> row = iterator.next();
			System.out.println(row.getKey() + " --> " + row.getValue());
		}
		
		
		//Set doesn't maintain duplicates
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("one");
		mySet.add("two");
		mySet.add("three");
		mySet.add("two");
		
		//advanced for loop
		for(String str : mySet){
			System.out.println(str);
		}
		//you will find "two" is not printed twice
	
		Iterator<String> setIterator = mySet.iterator();
		while(setIterator.hasNext()){
			System.out.println(setIterator.next());
		}
		
		
		Map<String,String> attributes  = new HashMap<String, String>();
		attributes.put("age", "18");
		attributes.put("height", "6");
		User user = new User(1,"ramu",attributes);
		
		Map<String,String> attributes1  = new HashMap<String, String>();
		attributes1.put("age", "18");
		attributes1.put("height", "6");
		User user1 = new User(1,"ramu",attributes1);
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user1);
		
		//Creating list of user objects from the data present in file system.
		
		List<User> myUsersList = new ArrayList<User>();
		try {
			FileReader fr = new FileReader("C:\\Users\\Dell\\Desktop\\usersData.txt");
			BufferedReader br = new BufferedReader(fr);
			String userLine;
			while((userLine = br.readLine()) != null){
				
				//Observe that each attribute is separated by "," and third attribute seperator is "$"
				String[] split = userLine.split(",");
				
				String username = split[0];
				int id = Integer.valueOf(split[1]);
				String attString =split[2];
				
				String[] attSplit = attString.split("$");
				Map<String,String> atributes = new HashMap<String,String>();
				
				for(int i = 0 ; i < attSplit.length ; i++){
					String[] eachAtt = attSplit[i].split(":");
					atributes.put(eachAtt[0], eachAtt[1]);
				}
				
				myUsersList.add(new User(id,username,atributes));
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Now you can iterate over users lists and execute the logic you want like finding username of person with highest age.
	}
	
	//lets assume this is a user class. All user's information is present in file.
	public class User{
		
		private int userId;
		private String username;
		private Map<String,String> userAttributes;
		
		public User(int id, String name, Map<String, String> attributes) {
			userId = id;
			username = name;
			userAttributes = attributes;
		}
		
	}

}
