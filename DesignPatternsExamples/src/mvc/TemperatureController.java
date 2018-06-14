package mvc;

/**
 * 
 *  Controller that helps in interaction between model and view.
 *  model and view should not tightly coupled with each other. with the help of the controller they are loosely coupled.
 *
 */
public class TemperatureController {

	private TemperatureModel model;
	private TemperatureView view;
	
	
	
	public TemperatureController(TemperatureModel model, TemperatureView view) {
		this.model = model;
		this.view = view;
	}

	public void refresh(){
		view.refresh(model.getTemperature());
	}
	
	public void showUI(){
		view.display(model.getTemperature());
		
	}
	
}
