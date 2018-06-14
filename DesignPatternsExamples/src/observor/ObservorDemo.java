package observor;

public class ObservorDemo {

	public static void main(String[] args) {
		
		/* 
		 * In observer pattern we have a bunch of observors(dependent objects) for a subject(main object)
		 * 
		 * Dollar values keeps on changing when the stock markets are open.
		 * When dollar value is changed , corresponding conversion ratios for
		 * Rupee, pound and Euro also get changed.
		 * 
		 * Imagine you have a web applications, where you display conversion ratios for Rupee, pound and Euro.
		 * 
		 * If dollar object changes, dependent objects like Rupee, pound and Euro need to be notified.
		 * So Dollar object will maintain list of dependent objects to notify when there is value change to it.
		 * 
		 * When someone class SetValue() method for dollar, we will update those dependent objects.
		 * 
		 * In other words dependent objects are observing a subject object called Dollar.
		 * 
		 */
		
		Dollar dollar = new Dollar(1);
		
		// Display objects are ready which will display values on UI.
		RupeeDisplay rupeeDisplay = new RupeeDisplay();
		PoundDisplay poundDisplay = new PoundDisplay();
		EuroDisplay  euroDisplay = new EuroDisplay();
		
		//Now dollar knows those display objects, which it should notify when dollar value is changed.
		dollar.addObservor(rupeeDisplay);
		dollar.addObservor(poundDisplay);
		dollar.addObservor(euroDisplay);
		
		dollar.setValue(1.1f);
		System.out.println("****************");
		dollar.setValue(1.3f);

	}

}
