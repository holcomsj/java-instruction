package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/stuffy_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "stuffy_user";
		String pwd = "help";

		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}
	
	public List<Stuffy> getAll() {
		String sql = "select * from stuffy";

		List<Stuffy> stuffy = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				//results set has a stuffy
				//process the result set row
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				Stuffy s = new Stuffy(type, color, size, limbs);
				stuffy.add(s);
				
			}
			return stuffy;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public Stuffy get(int id) {
		String sql = "select * from stuffy" + " where id = " + id;

		Stuffy s = null;
		try (Statement stmt = getConnection().createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			boolean stuffyExists = rs.next();
			if (stuffyExists) {
				//results set has a stuffy
				//process the result set row
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				s = new Stuffy(id2, type, color, size, limbs);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} return s;

	}
	
	public int add(Stuffy s) {
		int rowCount = 0;
		String sql = "Insert into stuffy (Type, Color, Size, Limbs)" +
					 "Values (?,?,?,?)";
		try(PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setString(2, s.getType());
			ps.setString(2, s.getColor());
			ps.setString(3, s.getSize());
			ps.setInt(4, s.getLimbs());
			rowCount = ps.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return rowCount;
	}
	
	public boolean update(Stuffy s) {
		String sql = "UPDATE stuffy set "
				+ " type = ?, "
				+ " color = ?, "
				+ " size = ?, "
				+ " limbs = ? "
				+ "where id = ?";
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, s.getType());
			ps.setString(2, s.getColor());
			ps.setString(3, s.getSize());
			ps.setInt(4, s.getLimbs());
			ps.setInt(5, s.getId());
			ps.executeUpdate();
			return true;
		}catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}
	
	public boolean delete(Stuffy s) {
		String sql = "Delete from Stuffy "
				+ "Where id = ?";
		try (Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(1, s.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
	}

}
