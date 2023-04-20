package HW19_04_2023.lesson20230419.jdbc;

import java.util.List;

public class WordApp{

	public static void main(String[] args) {

		CountryLanguageDAO countryLanguageDAO = new CountryLanguageDAO();
		List<CountryLanguage> countryLanguageList = countryLanguageDAO.getAll();
		countryLanguageList.forEach(System.out :: println);

		System.out.println("countryCode: " + "ZWE" + " : " + countryLanguageDAO.get("ZWE"));
		countryLanguageDAO.save(new CountryLanguage("ZI", "Zimbabwe", "E", 99));
		countryLanguageDAO.delete("ZWE");
//=======================================================================================================
//		CityDAO cityDAO = new CityDAO();
//
//		List<City> cities = cityDAO.getAll();
//		cities.forEach(System.out :: println);
//
//		System.out.println("Get by id: " + 4079 + " : " + cityDAO.get(4079));
//
//		cityDAO.getCityByCountryAndPopulation("USA", 1_000_000).forEach(System.out :: println);

//        cityDAO.save(new City(999, "Dream City", "USA", "", 1));
//        cityDAO.delete(4083);
	}
}