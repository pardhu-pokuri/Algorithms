package ch2_basicthreadsync;

/**
 *  
 *  Simulation of Cinema hall that has two screens and two counters that sell tickets.
 * Synchronized block is used to synchronize only that part of code which is critical. Making whole method synchronized is not efficient as it makes all other threads to wait
 * for access for other synchronized methods.
 * 
 *  Best way to find out the all the variables which are shared and figure out the dependent and independent shared data and synchronize each dependent shared variables using a dedicated
 *  object and using synchronized block.
 *  
 *  Here vacancies in cinema1 is independent with vacancies in cinema2. So we can use synchronized block with a separate object for each cinema.
 */
public class Cinema {

	private int vacanciesCinema1;
	private int vacanciesCinema2;
	private final Object cinema1Object;
	private final Object cinema2Object;

	public Cinema() {
		vacanciesCinema1 = 20;
		vacanciesCinema2 = 20;
		cinema1Object = new Object();
		cinema2Object = new Object();
	}
	
	/**
	 * sells tickets for cinema in screen1
	 * @param number
	 * @return
	 */
	public boolean sellTickets1(int number) {
		synchronized (cinema1Object) {
			if (vacanciesCinema1 >= number) {
				vacanciesCinema1 -= number;
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 * 
	 * returns the already sold tickets for cinema in screen1
	 * @param number
	 * @return
	 */
	public boolean returnTickets1(int number) {
		synchronized (cinema1Object) {
			vacanciesCinema1 += number;
			return true;
		}
	}

	/**
	 * sells tickets for cinema in screen2
	 * @param number
	 * @return
	 */
	public boolean sellTickets2(int number) {
		synchronized (cinema2Object) {
			if (vacanciesCinema2 >= number) {
				vacanciesCinema2 -= number;
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * returns the already sold tickets for cinema in screen1
	 * @param number
	 * @return
	 */
	public boolean returnTickets2(int number) {
		synchronized (cinema2Object) {
			vacanciesCinema2 += number;
			return true;
		}
	}
	
	public long getVacanciesCinema1(){
		return vacanciesCinema1;
	}
	
	public long getVacanciesCinema2(){
		return vacanciesCinema2;
	}
}
