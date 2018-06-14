package mvc;

public class MVCDemo {

	public static void main(String[] args) throws InterruptedException {

		TemperatureModel model = new TemperatureModel();
		model.setTemperature(12);

		TemperatureView view = new TemperatureView();
		/*
		 * controller has both view and model information. but model is not
		 * aware of view, view is not aware of model.
		 * model and view don't interact with each other, controller facilitates the interaction
		 * between them.
		 * 
		 * model and view should not tightly coupled with each other.
		 * with the help of the controller they are loosely coupled.
		 */
		TemperatureController controller = new TemperatureController(model, view);

		// controller shows UI
		controller.showUI();

		// update model and ask control to refresh the view
		model.setTemperature(15);
		Thread.sleep(3000); // just sleeping for 3 seconds, so that update of text box is visible.
		controller.refresh();

	}

}
