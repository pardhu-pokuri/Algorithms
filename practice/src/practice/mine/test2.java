package practice.mine;

public class test2{
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("name : "+ Thread.currentThread().getName());
				
			}
			
		};
		Thread t = new Thread(r,"pardhu"){
			@Override
			public void run() {
				System.out.println("name in thread class : "+ Thread.currentThread().getName());
				
			}
		};
		Thread t2 = new Thread(r,"pardhu2");
		t.start();
		Thread.currentThread().sleep(10);
		t2.start();
	}

}
