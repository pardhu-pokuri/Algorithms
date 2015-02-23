package practice;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		A ref1 = new C();
		B ref2 = (B) ref1;
		System.out.println(ref2.doIt());
		
		A a = new A();
		B b = new B();
		b = (B)a;
		
	}

}


 class A{
	int doIt(){
		return 0;
	}
}

class B extends A{
	int doIt(){
		return 1;
	}
	
}

class C extends B {
	
	int doIt(){
		return 2;
	}
}