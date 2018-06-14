package observor;

import java.util.ArrayList;
import java.util.List;

public class Dollar {
	
	private float value;

	List<Observor> observors = new ArrayList<Observor>();
	
	public Dollar(float value) {
		this.value = value;
	}
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
		for (Observor observor : observors) {
			observor.update();
		}
	}
	
	public void addObservor(Observor observor){
		observors.add(observor);
	}

}
