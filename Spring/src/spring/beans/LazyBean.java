package spring.beans;

public class LazyBean {
	
	public LazyBean() {
		System.out.println("Constructing lazy bean ");
	}
	
	public void details(){
		System.out.println("This is lazy bean and its details");
	}
}
