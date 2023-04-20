package HW19_04_2023.lesson20230419.jdbc;

import java.sql.*;

public class JDBCConnectionExample{

	public static void main(String[] args) {

		// Class.forName("com.mysql.jdbc.Driver");
		try(
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "123456789");
				Statement statement = connection.createStatement();

				) {


			//	boolean execute = statement.execute("select now()");    //запрос в БД
			ResultSet resultSet = statement.executeQuery("select* from countryLanguage");

			int columnCount = resultSet.getMetaData().getColumnCount();


			while(resultSet.next()) {
				for(int i = 1; i <= columnCount; i++){
					System.out.print(resultSet.getString(i) + " ");

				}
				System.out.println("/n");
				//	System.out.println(resultSet.getString(3)); //достает только указанную колонку
			}
			resultSet.close();
			statement.close();

		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
