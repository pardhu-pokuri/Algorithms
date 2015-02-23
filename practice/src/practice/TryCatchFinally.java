package practice;

public class TryCatchFinally {

	public static void main(String[] args) throws Exception {
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		}finally{
			System.out.println("Finally");
		}
		throw new Exception();
	}
	

}
