package ch2_basicthreadsync;

public class CinemaExample {

	public static void main(String[] args) {

		Cinema cinema = new Cinema();
		
		TicketOffice1 office1 = new TicketOffice1(cinema);
		Thread office1Thread = new Thread(office1);
		
		TicketOffice2 office2 = new TicketOffice2(cinema);
		Thread office2Thread = new Thread(office2);
		
		office1Thread.start();
		office2Thread.start();
		
		try {
			office1Thread.join();
			office2Thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Vacancies in Screen1 : " + cinema.getVacanciesCinema1());
		System.out.println("Vacancies in Screen2 : " + cinema.getVacanciesCinema2());
		
	}

}
