package observor;

public class EuroDisplay implements Observor{

	@Override
	public void update() {
		System.out.println("New dollar value is converted to Euro and displayed in UI");
	}

}
