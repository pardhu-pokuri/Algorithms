package ch2_basicthreadsync;

/**
 * model for account
 *
 */
public class Account {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * increase balance by given amount 
	 * @param amount
	 */
	public synchronized void addAmount(double amount){
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp = tmp + amount;
		balance = tmp;
	}
	
	/**
	 * decreases balance by given amount
	 * @param amount
	 */
	public synchronized void subtractAmount(double amount){
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp = tmp - amount;
		balance = tmp;
	}
	
}
