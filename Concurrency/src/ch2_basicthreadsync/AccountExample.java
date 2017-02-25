package ch2_basicthreadsync;

/**
 * 
 * Here {@link Account} is shared by two threads 'bank' and 'company'. 
 * Thread 'bank' uses {@link Account#addAmount(double)} method to increase balance.
 * Thread 'company' uses {@link Account#subtractAmount(double)} method to decrease balance.
 * If both addAmount and subtractAmount methods are not synchronized , the value of final balance in the account cannot be guaranteed 
 * as these methods has some critical code.
 */
public class AccountExample {
	
	public static void main(String[] args) {
		// creating an account and setting initial balance
		Account account = new Account();
		account.setBalance(1000);
		
		// creating a bank task that increases balance in account.
		Bank bank = new Bank(account);
		Thread bankThread = new Thread(bank);
		
		// creating a company task that decreases balance in account.
		Company company = new Company(account);
		Thread companyThread = new Thread(company);
		
		System.out.println("Initial account balance : " + account.getBalance());
		
		//starting both threads. First thread increases the balance, second thread decreases the balance.
		
		companyThread.start();
		bankThread.start();
		
		// making the main thread to wait till the completion of other threads, so that we can print the final balance. 
		try {
			companyThread.join();
			bankThread.join();
			System.out.println("Final account balance : " + account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
