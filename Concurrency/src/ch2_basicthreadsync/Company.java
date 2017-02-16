package ch2_basicthreadsync;

/**
 * This task will increase the amount from the account multiple times.
 *
 */
public class Company implements Runnable{
	
	private Account account;
	
	public Company(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100 ; i++) {
			account.addAmount(1000);
		}
	}

}
