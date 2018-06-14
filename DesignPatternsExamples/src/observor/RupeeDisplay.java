package observor;

public class RupeeDisplay implements Observor{

	@Override
	public void update() {
		System.out.println("New dollar value is converted to Rupee and displayed in UI");
		
	}

}
