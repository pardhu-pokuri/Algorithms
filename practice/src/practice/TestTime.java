package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		ArrayList<Long> longList = new ArrayList<Long>();
		for (long i = 0; i < 10000 ; i++) {
			longList.add(i);
		}
		
		long currTime = System.currentTimeMillis();
		long min = longList.get(0);
		long k = 0;
		Iterator<Long> iterator = longList.iterator();
		while (iterator.hasNext()) {
			long current = iterator.next();
			if(current < min ){
				min = current;
			}
			k++;
		}
		System.out.println(System.currentTimeMillis() - currTime);
		System.out.println(k);
		
	}

}
