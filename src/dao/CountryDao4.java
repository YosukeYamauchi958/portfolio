package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Country;

public class CountryDao {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/testdb2";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private Connection getConnection() throws
			ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		return con;
	}

public Country searchByPopulation(int population) {
	Country country = null;
	String sql = "SELECT id, country, capital, population, area, density" +" FROM country WHERE population>= ?";
	try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setInt(1, population);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			country = new Country();
			int id = rs.getInt("id");
			String country1 = rs.getString("country");
			String capital = rs.getString("capital");
			int population1 = rs.getInt("population");
			int area = rs.getInt("area");
			double density = rs.getDouble("density");

			country.setId(id);
			country.setCountry(country1);
			country.setCapital(capital);
			country.setPopulation(population1);
			country.setArea(area);
			country.setDensity(density);
		}
	} catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return country;
  }
}
