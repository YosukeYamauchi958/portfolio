package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Trainee;

public class TraineeDao {
	private static final String URL = "jdbc:mysql://localhost/testdb2";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		return con;
	}

	public List<Trainee> searchByCoId(int coId) {
		List<Trainee> list = new ArrayList<>();

		try {
			Connection con = getConnection();
			String sql = "SELECT id,name,age FROM trainee WHERE co_id = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, coId);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Trainee trainee = new Trainee();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				trainee.setId(id);
				trainee.setName(name);
				trainee.setAge(age);
				list.add(trainee);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
}
