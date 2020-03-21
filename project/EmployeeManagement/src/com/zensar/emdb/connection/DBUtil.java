package com.zensar.emdb.connection;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBUtil {
	    static Connection con = null;
		public static Connection getConnection() {
			FileReader file;
			try {
				file = new FileReader("conn.properties");
				Properties p = new Properties();
				p.load(file);
				Class.forName(p.getProperty("drivername"));
				con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username")
													,p.getProperty("password"));
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}//end of function
}//end of class
