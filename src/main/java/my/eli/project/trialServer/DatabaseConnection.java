package my.eli.project.trialServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	protected Connection conn = null;
	String URL = "localhost:5432/trialserverdb";
	
	
	public DatabaseConnection(Connection conn){
		this.conn = conn;
	}
	
	public DatabaseConnection() {
		findConnection();
	}
	
	private void findConnection() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();//this postgresSQL part might be off
		} catch (Exception ex) {
			System.err.println("Driver class not found");
		}
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://" + URL);//this needs to be improved
		} catch (SQLException ex) {
			System.out.println("Exception in DatabaseConnection findConnection()");
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Exception in DatabaseConnection close()");
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		}
	}
	

}
