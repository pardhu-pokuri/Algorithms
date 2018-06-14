package observor;

public class PoundDisplay implements Observor{

	@Override
	public void update() {
		System.out.println("New dollar value is converted to Pound and displayed in UI");
		
	}

}
