package spring.beans;

public class Italy implements Country{
	
	private String continent;
	private String language;
	private String currency;
	private String capital;
	private int id;
	
	public Italy(String continent, String language, String currency, String capital, int id) {
		this.continent = continent;
		this.language = language;
		this.currency = currency;
		this.capital = capital;
		this.id = id;
	}
	
	@Override
	public void visit() {
		System.out.println("Continent is : " + continent);
		System.out.println("Language is : " + language);
		System.out.println("Currency is : " + currency);
		System.out.println("Capital is : " + capital);
		System.out.println("Id is : " + id);
	}
	
}
