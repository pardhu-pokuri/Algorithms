package practice.mine;

public class ClosureExample {

	
	public static void main(String[] args) {
		
		final int a = 10;
		doProcess(2, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i + a);
				
			}
		});
		
	}
	
	public static void doProcess(int i ,Process p){
		p.process(i);
	}
	
	

}

interface Process{
	void process(int i);
}
