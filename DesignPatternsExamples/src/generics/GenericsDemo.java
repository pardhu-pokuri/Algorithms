package generics;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
		StringItem strItem = new StringItem();
		strItem.setItem("mystring");
		
		IntegerItem intItem = new IntegerItem();
		intItem.setItem(12);
		
		Item<String> strItemGenric = new Item<String>();
		strItemGenric.setItem("myString");
		
		Item<Integer> integer = new Item<Integer>();
		integer.setItem(13);
	}
}
