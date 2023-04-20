package HW19_04_2023.lesson20230419.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryLanguageDAO implements WorldDAO<CountryLanguage>{

	private final String GET_ALL = "select * from countrylanguage";
	private final String country_Code = "select * from  countrylanguage where countryCode = ?";
	private final String SAVE_Language = "INSERT into countrylanguage VALUES (0,?,?,?,?)";
	private final String DELETE_Language = "DELETE  FROM countrylanguage where countryCode =?";


	private static CountryLanguage getCountryLanguage(ResultSet resultSet) throws SQLException {
		CountryLanguage countryLanguage = new CountryLanguage(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getFloat(4));
		return countryLanguage;
	}

	@Override
	public List<CountryLanguage> getAll() {
		List<CountryLanguage> countryLanguages = new ArrayList<>();

		try(Connection connection = ConnectorDB.getConnection(); Statement statement = connection.createStatement();) {

			ResultSet resultSet = statement.executeQuery(GET_ALL);
			while(resultSet.next()) {
				CountryLanguage countryLanguage = getCountryLanguage(resultSet);
				countryLanguages.add(countryLanguage);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return countryLanguages;
	}


	@Override
	public Optional<CountryLanguage> get(String countryCode) {
		try(Connection connection = ConnectorDB.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(country_Code);) {
			preparedStatement.setString(1, countryCode);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				CountryLanguage countryLanguage = getCountryLanguage(resultSet);
				return Optional.of(countryLanguage);
			}

		} catch(SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	@Override
	public void save(CountryLanguage countryLanguage) {
		try(Connection connection = ConnectorDB.getConnection();
			PreparedStatement statement = connection.prepareStatement(SAVE_Language);
			) {
			statement.setString(1, countryLanguage.getCountryCode());
			statement.setString(2, countryLanguage.getLanguage());
			statement.setString(3, countryLanguage.getIsOfficial());
			statement.setFloat(4, countryLanguage.getPercentage());
			boolean result = statement.execute();
			System.out.println("Result: " + result);
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}


	@Override
	public void delete(String countryCode) {
		try(Connection connection = ConnectorDB.getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_Language);) {
			statement.setString(1, countryCode);
			int result = statement.executeUpdate();
			System.out.println("Result: " + result);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public Optional<CountryLanguage> get(int id) {
		throw new RuntimeException("Operation is not supported");
	}

	@Override
	public void delete(int id) {
		throw new RuntimeException("Operation is not supported");
	}
}
