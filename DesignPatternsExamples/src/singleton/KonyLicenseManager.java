package singleton;

/*
 * 1)  private constructor i.e no can create object outside this class.
 * 2)  But we can create an object of this inside this class, so lets create only one private object inside this class
 * 3)  lets give a public method called "getInstance" that returns the above object.
 * 4)  Since the outer world cannot create object of this class, we should make the above method to static.
 * 5)  since the method "getInstance" is static, object should be changed to static as well.
 *
 *	why singleton object:
 *  When we want to ensure that only one object is created for a class, we will go for singleton pattern.
 *  For example: In my previous organization, we have license manager class which validates license, determines the type of license,
 *  returns expire date for license etc. As we want to ensure that all the dependent projects rely on a single license manager object,
 *  and performs the crucial logic, we made it singleton.
 *
 */
public class KonyLicenseManager {
	
	private KonyLicenseManager(){
		
	}
	
	private static KonyLicenseManager manager = new KonyLicenseManager();
	
	public static KonyLicenseManager getInstance(){
		return manager;
	}

}
