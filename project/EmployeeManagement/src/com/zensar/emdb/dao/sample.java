package com.zensar.emdb.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 class Demo{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");  
		
		
		String query;
		CallableStatement cstat;
		/*query = "{CALL showName(?,?)}";
		cstat = conn. prepareCall(query);
		cstat.setInt(1,1001);
		cstat.registerOutParameter(2, Types.VARCHAR);
		cstat.execute();
		System.out.println("Name=  "+cstat.getString(2));*/
		
		
	/*	query = "{call deleteData(?)}";
		cstat = conn.prepareCall(query);
		cstat.setInt(1, 1004);
		
		boolean status = cstat.execute();
		if(!status) 
				System.out.println("Deleted!!!");
		
		query = "{call updateDate()}";
		cstat = conn.prepareCall(query);
		status = cstat.execute();
		*/
		int id = 0;
		String name = null;
		query = "{Select id, name into ?,? from Sample}";
		PreparedStatement pst = conn.prepareStatement(query);
	//	PreparedStatement pst = c.prepareStatement("insert into sample values(?,?,?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		
	}
}

	
	
	
