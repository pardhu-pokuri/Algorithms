package singleton;

import java.io.IOException;

public class TestConstructor {

	private static final TestConstructor instance = new TestConstructor();
	
	private TestConstructor() throws IOException {
		
		int a = 2;
		int b = 0;
		try{
			int c = a/b;
		}catch(Exception e){
			throw new IOException(e);
		}
	}
	
	public static TestConstructor getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		
		TestConstructor obj = TestConstructor.getInstance();
		System.out.println(obj);
	}

}
