package spring.beans;

public class Address {
	
	private String area;
	
	private String city;
	
	private String state;
	
	private int pin;
	
	public void setArea(String area) {
		this.area = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void details() {
		
		System.out.println("Area is :" + area);
		System.out.println("City is :" + city);
		System.out.println("State is :" + state);
		System.out.println("Pin is :" + pin);
	}

	
}
