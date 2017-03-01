package spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tourist {

	private Japan japan;
	private Italy italy;
	private List<Country> countries;
	private Map<String, Country> mappedCountries;

	public Tourist(Japan japan) {
		this.japan = japan;
	}
	
	public Tourist(Japan japan, Italy italy){
		this.japan = japan;
		this.italy = italy;
	}
	
	public Tourist(List<Country> countries){
		this.countries = countries;
	}

	public Tourist(Map<String, Country> mappedCountries){
		this.mappedCountries = mappedCountries;
	}
	
	public void tourSingleCountry(){
		japan.visit();
	}
	
	public void tourTwoCountries(){
		System.out.println("Japan details : ");
		japan.visit();
		System.out.println("*****************");
		System.out.println("Italy details : ");
		italy.visit();
	}
	
	public void tourListCountries(){
		for (Country country : countries) {
			country.visit();
		}
	}
	
	public void tourMappedCountries(){
		for (Entry<String, Country> country : mappedCountries.entrySet()) {
			System.out.println(country);
		}
	}
}
