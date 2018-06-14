package factory;

/**
 * factory is like an inventory...
 * you will ask the inventory what you need by sending some parameter.
 * It will return an item from inventory. 
 *
 */
public class FactoryDemo {

	public static void main(String[] args) {
		
		/*
		 * To the outer world nut, bolt and wheel are just parts.
		 * They don't know how the object is created internally.
		 * 
		 * Outer world doesn't bother about the constructor parameters of each part,
		 * doesn't bother about how to create an object of each part, they just need
		 * to call getPart() method by sending some parameter, it will return your
		 * desired Part object.
		 * 
		 * With this you are abstracting the object creation logic.
		 * 
		 * 
		 */
		Part nut = PartFactory.getPart("nut");
		Part bolt = PartFactory.getPart("bolt");
		Part wheel = PartFactory.getPart("wheel");
		
		System.out.println(nut.getName());
		System.out.println(bolt.getName());
		System.out.println(wheel.getName());
		
	}

}
