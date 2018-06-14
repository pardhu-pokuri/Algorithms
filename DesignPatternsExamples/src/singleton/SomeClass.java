package singleton;

public class SomeClass {

	public static void main(String[] args) {
		
		KonyLicenseManager manager1 = new KonyLicenseManager();
		KonyLicenseManager manager2 = KonyLicenseManager.getInstance();;
	}

}
