//package fghsp.test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//
//public class ReadData {
//	
//	public ReadData () {
//	}
//	
//	public Statement getDatabaseConnection(String db_connect_string, String db_userid, String db_password) {
//		try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			Connection conn = DriverManager.getConnection(db_connect_string);
//			System.out.println("connected");
//			Statement statement = conn.createStatement();
//			return statement;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public String getSolutionData(Statement statement) {
//		try {
//			StringBuffer queryString = new StringBuffer("select * from solution, contact, is_owner_solution where contact.id = is_owner_solution.owner_id AND solution.id = is_owner_solution.solution_id ORDER BY solution.picture ASC;");
//			System.out.println(queryString.toString());
//			ResultSet rs = statement.executeQuery(queryString.toString());
//			
//			String result = "[ ";
//			while (rs.next()) {
//				result += "{ \"Name\": \"" + rs.getString(3) + "\",";
//				result += " \"Owner\": \"" + rs.getString(13) + " " + rs.getString(14) + "\",";
//				result += " \"HPSM_Name\": \"" + rs.getString(7) + "\",";
//				result += " \"ID\": \"" + rs.getString(1) + "\",";
//				result += " \"IMG_Name\": \"" + rs.getString(5) + "\"},";
//				System.out.println(result);
//				
//			}
//			result = result.substring(0, result.length() - 1) +  "]";
//			System.out.println(result);
//			return result;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public String getComponentDataForTable(Statement statement, String id) {
//		try {
//			StringBuffer queryString = new StringBuffer("select * from component, contact, is_owner_component, sc_relationship where contact.id = is_owner_component.owner_id AND component.id = is_owner_component.component_id AND component.id = sc_relationship.component_id AND sc_relationship.solution_id = '" 
//					+ id + "';");
//			System.out.println(queryString.toString());
//			ResultSet rs = statement.executeQuery(queryString.toString());
//			
//			String result = "[ ";
//			while (rs.next()) {
//				result += "{ \"componentName\": \"" + rs.getString(3) + "\",";
//				result += " \"ownerName\": \"" + rs.getString(27) + " " + rs.getString(28) + "\",";
//				result += " \"ID\": \"" + rs.getString(1) + "\",";
//				result += " \"img\": \"" + rs.getString(5) + "\"},";
//				System.out.println(result);
//				
//			}
//			result = result.substring(0, result.length() - 1) +  "]";
//			System.out.println(result);
//			return result;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public String getSolutionContacts(Statement statement, String id) {
//		try {
//			StringBuffer queryString = new StringBuffer("select * from solution, contact, is_owner_solution where contact.id = is_owner_solution.owner_id AND solution.id = is_owner_solution.solution_id "
//					+ "AND solution.id = '" + id + "';");
//			System.out.println(queryString.toString());
//			ResultSet rs = statement.executeQuery(queryString.toString());
//			
//			String result = "[ ";
//			while (rs.next()) {
//				result += "{ \"Solution_Name\": \"" + rs.getString(3) + "\",";
//				result += " \"name\": \"" + rs.getString(13) + " " + rs.getString(14) + "\",";
//				result += " \"description\": \"" + rs.getString(4) + "\",";
//				result += " \"role\": \"Owner\",";
//				result += " \"HPSM_Name\": \"" + rs.getString(7) + "\",";
//				result += " \"ID\": \"" + rs.getString(1) + "\",";
//				result += " \"email\": \"" + rs.getString(15) + "\",";
//				result += " \"location\": \"" + rs.getString(16) + "\",";
//				result += " \"country\": \"" + rs.getString(17) + "\",";
//				result += " \"team\": \"" + rs.getString(18) + "\",";
//				result += " \"img\": \"" + rs.getString(20) + "\",";
//				result += " \"IMG_Name\": \"" + rs.getString(5) + "\"},";
//				System.out.println(result);
//				
//			}
//			
//			queryString = new StringBuffer("select * from solution, contact, is_deputy_solution where contact.id = is_deputy_solution.owner_id AND solution.id = is_deputy_solution.solution_id "
//					+ "AND solution.id = '" + id + "';");
//			System.out.println(queryString.toString());
//			rs = statement.executeQuery(queryString.toString());
//			
//			while (rs.next()) {
//				result += "{ \"name\": \"" + rs.getString(13) + " " + rs.getString(14) + "\",";
//				result += " \"role\": \"Deputy\",";
//				result += " \"email\": \"" + rs.getString(15) + "\",";
//				result += " \"location\": \"" + rs.getString(16) + "\",";
//				result += " \"country\": \"" + rs.getString(17) + "\",";
//				result += " \"team\": \"" + rs.getString(18) + "\",";
//				result += " \"img\": \"" + rs.getString(20) + "\"},";
//				System.out.println(result);				
//			}
//			
//			queryString = new StringBuffer("select * from solution, contact, is_bo_solution where contact.id = is_bo_solution.owner_id AND solution.id = is_bo_solution.solution_id "
//					+ "AND solution.id = '" + id + "';");
//			System.out.println(queryString.toString());
//			rs = statement.executeQuery(queryString.toString());
//			
//			while (rs.next()) {
//				result += "{ \"name\": \"" + rs.getString(13) + " " + rs.getString(14) + "\",";
//				result += " \"role\": \"Business\",";
//				result += " \"email\": \"" + rs.getString(15) + "\",";
//				result += " \"location\": \"" + rs.getString(16) + "\",";
//				result += " \"country\": \"" + rs.getString(17) + "\",";
//				result += " \"team\": \"" + rs.getString(18) + "\",";
//				result += " \"img\": \"" + rs.getString(20) + "\"},";
//				System.out.println(result);				
//			}
//			result = result.substring(0, result.length() - 1) +  "]";
//			System.out.println(result);
//			return result;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public String getComponentContacts(Statement statement, String id) {
//		try {
//			StringBuffer queryString = new StringBuffer("select * from component, contact, is_owner_component where contact.id = is_owner_component.owner_id AND component.id = is_owner_component.component_id "
//					+ "AND component.id = '" + id + "';");
//			System.out.println(queryString.toString());
//			ResultSet rs = statement.executeQuery(queryString.toString());
//			
//			String result = "[ ";
//			while (rs.next()) {
//				result += "{ \"Component_Name\": \"" + rs.getString(3) + "\",";
//				result += " \"name\": \"" + rs.getString(27) + " " + rs.getString(28) + "\",";
//				result += " \"description\": \"" + rs.getString(4) + "\",";
//				result += " \"role\": \"Owner\",";
//				result += " \"HPSM_Name\": \"" + rs.getString(7) + "\",";
//				result += " \"ID\": \"" + rs.getString(1) + "\",";
//				result += " \"email\": \"" + rs.getString(29) + "\",";
//				result += " \"location\": \"" + rs.getString(30) + "\",";
//				result += " \"country\": \"" + rs.getString(31) + "\",";
//				result += " \"team\": \"" + rs.getString(32) + "\",";
//				result += " \"img\": \"" + rs.getString(20) + "\",";
//				result += " \"rm\": \"" + rs.getString(22) + "\",";
//				result += " \"arch\": \"" + rs.getString(14) + "\",";
//				result += " \"IMG_Name\": \"" + rs.getString(5) + "\"},";
//				System.out.println(result);
//				
//			}
//			
//			queryString = new StringBuffer("select * from component, contact, is_deputy_component where contact.id = is_deputy_component.owner_id AND component.id = is_deputy_component.component_id "
//					+ "AND component.id = '" + id + "';");
//			System.out.println(queryString.toString());
//			rs = statement.executeQuery(queryString.toString());
//			
//			while (rs.next()) {
//				result += "{ \"name\": \"" + rs.getString(27) + " " + rs.getString(28) + "\",";
//				result += " \"role\": \"Deputy\",";
//				result += " \"email\": \"" + rs.getString(29) + "\",";
//				result += " \"location\": \"" + rs.getString(30) + "\",";
//				result += " \"country\": \"" + rs.getString(31) + "\",";
//				result += " \"team\": \"" + rs.getString(32) + "\",";
//				result += " \"img\": \"" + rs.getString(20) + "\"},";
//				System.out.println(result);				
//			}
//			
//			queryString = new StringBuffer("select * from component, contact, is_bo_component where contact.id = is_bo_component.owner_id AND component.id = is_bo_component.component_id "
//					+ "AND component.id = '" + id + "';");
//			System.out.println(queryString.toString());
//			rs = statement.executeQuery(queryString.toString());
//			
//			while (rs.next()) {
//				result += "{ \"name\": \"" + rs.getString(27) + " " + rs.getString(28) + "\",";
//				result += " \"role\": \"Business\",";
//				result += " \"email\": \"" + rs.getString(29) + "\",";
//				result += " \"location\": \"" + rs.getString(30) + "\",";
//				result += " \"country\": \"" + rs.getString(31) + "\",";
//				result += " \"team\": \"" + rs.getString(32) + "\",";
//				result += " \"img\": \"" + rs.getString(20) + "\"},";
//				System.out.println(result);				
//			}
//			result = result.substring(0, result.length() - 1) +  "]";
//			System.out.println(result);
//			return result;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//}
