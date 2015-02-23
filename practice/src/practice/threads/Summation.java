package practice.threads;

public class Summation {

	/**
	 * @param args
	 */

	public static int count = 0;
	public static int sum = 0;
	public static int[] array = new int[10000];
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10000 ; i++){
			array[i] = i;
		}
		
		MySumThread thread;
		for(int i = 0 ; i < 4 ; i++){
			 thread = new MySumThread();
			thread.start();
		}
		
		System.out.println("***Through Threads "+sum);
		int newsum = 0;
		for(int i = 0 ; i < 10000 ; i++){
			newsum += array[i];
		}
		System.out.println("Through Main "+ newsum);
	}

}

class MySumThread extends Thread{
	
	public void run(){
		
		while(Summation.count < 10000){
			Summation.sum += Summation.array[Summation.count];
			Summation.count++;
		}
		
	}
}

