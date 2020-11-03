package edu.pcc.cis233j.countries;

import java.util.List;

/**
 * Read from the Country database and print data on the countries
 * @author Cara Tang
 * @author Stephen Harmon
 * @version 11-2-2020
 */
public class Main {
	public static void main(String[] args) {
		CountryDB cdb = new CountryDB();
		List<Country> countries = cdb.getCountries();

		for(Country country : countries) {
			System.out.println("Name:" + country.getName()
					+ " Population : " + country.getPopulation()
					+ " Median Age: " + country.getMedianAge()
					+ " Coastline: " + country.getCoastlineKm() + "km"
					+ " Languages: " + country.getLanguages());

		}

	}

}
