package practice.threads;

public class printNumbers {

	public static boolean isEven = true;
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		Thread t1 = new Thread(new EvenRunnable(obj));
		Thread t2 = new Thread(new OddRunnable(obj));
		t1.start();
		t2.start();
	}

}


class EvenRunnable implements Runnable{

	Object obj;
	
	EvenRunnable(Object obj){
		this.obj = obj;
	}
	
	public void run1() {
		
		for(int i = 0 ; i < 10; i++){
			synchronized (obj) {
				System.out.println(2*i);
				printNumbers.isEven = false;	
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10; i++){
			synchronized (obj) {
				if(printNumbers.isEven){
					System.out.println(2*i);
				}
				printNumbers.isEven = false;
				obj.notify();
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}

class OddRunnable implements Runnable{

	Object obj;
	
	OddRunnable(Object obj){
		this.obj = obj;
	}
	
	public void run1() {
		
		for(int i = 0 ; i < 10 ; i++){
			while(printNumbers.isEven){
				
			}
			synchronized (obj) {
				System.out.println(2*i + 1);
				printNumbers.isEven = true;
				obj.notify();
			}
		}
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10 ; i++){
			synchronized (obj) {
				if(printNumbers.isEven){
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(2*i + 1);
				printNumbers.isEven = true;
				obj.notify();
			}
		}
	}
	
	
	
}
