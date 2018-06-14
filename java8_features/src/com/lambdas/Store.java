package com.lambdas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Store {
	
	public static void main(String[] args) {
		
		MyStore mystore = new MyStore();
		
		Function<MyStore, Map<String, String>> f1 = (myStore -> (mystore == null ? null : mystore.getCommand()));
		Function<Map<String,String>, Map<String,String>> f2 = (map -> (map == null ? Collections.emptyMap() : map));
		Map<String, String> apply = f2.apply(f1.apply(mystore));
		System.out.println(apply);
		
	}
	
	static class MyStore{
		
		public Map<String,String> getCommand(){
			Map<String, String> map = new HashMap<>();
			map.put("unninai", "heshma");
			return map;
		}
		
	}

}
