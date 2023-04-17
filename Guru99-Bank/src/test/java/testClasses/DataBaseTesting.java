package testClasses;

import java.sql.Connection;
import java.sql.ResultSet;

import org.testng.annotations.Test;

import com.mysql.cj.xdevapi.Statement;

public class DataBaseTesting {
	// Connection object
		static Connection conn = null;
		// Statement object-----for execute the query
		private static Statement stmt;
		// Result Set-----fatch result from DB and store it in resultSet
		private static ResultSet results = null;
		// Constant for Database URL
		public static String DB_URL = "jdbc:mysql://localhost:3306/selenium"; // ORacle "jdbc:oracle:thin:@localhost:1521/sid"
		
		// Constant for Database Username
		public static String DB_USER = "root";
		// Constant for Database Password
		public static String DB_PASSWORD = null;
		// Driver
		public static String driver = "com.mysql.jdbc.Driver"; // "oracle.jdbc.driver.OracleDriver"
		// WebDriver
		// public static WebDriver dv;
		

  @Test
  public void f() {
  }
}
