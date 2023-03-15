package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Country;

public class CountryDao2 {
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

public List<Country> searchByPopulation(int population) {
	List<Country> list = new ArrayList<>(); 
	String sql = "SELECT id, country, capital, population, area, density" +" FROM country WHERE population>= ?";
	try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setInt(1, population);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			//データを1レコードずつエンティティに格納する
			Country country = new Country();

			country.setId(rs.getInt("id"));
			country.setCountry(rs.getString("country"));
			country.setCapital(rs.getString("capital"));
			country.setPopulation(rs.getInt("population"));
			country.setArea(rs.getInt("area"));
			country.setDensity(rs.getDouble("density"));
			//エンティティをリストに格納する
			list.add(country);			
			
		}
	} catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return list;
  }
}
