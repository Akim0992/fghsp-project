package fghsp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ReadData {
	
	public ReadData () {
	}
	
	public Statement getDatabaseConnection(String db_connect_string, String db_userid, String db_password) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(db_connect_string);
			System.out.println("connected");
			Statement statement = conn.createStatement();
			return statement;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getSolutionData(Statement statement) {
		try {
			StringBuffer queryString = new StringBuffer("select * from solution");
			System.out.println(queryString.toString());
			ResultSet rs = statement.executeQuery(queryString.toString());
			
			String result = "";
			while (rs.next()) {
				result += rs.getString(1);
				System.out.println(result);
			}
			System.out.println(result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
