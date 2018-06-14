package factory;

/**
 *  
 *  Part is a super class, it has many implementations like Nut, bolt etc.
 *  But you need only one part, just send the name of the part,
 *  you will get the part object, but the outer world is not aware
 *  of object creation.
 *
 */

public class PartFactory {

	public static Part getPart(String partName) {

		if ("nut".equals(partName)) {
			return new Nut();
		} else if ("bolt".equals(partName)) {
			return new Bolt();
		} else if ("lever".equals(partName)) {
			return new Lever();
		} else if ("wheel".equals(partName)) {
			return new Wheel();
		}

		return null;

	}

}
