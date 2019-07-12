package com.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDatabase 
{
	public static Connection con;
	public static Connection getOracleConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			con=DriverManager.getConnection("jdbc:oracle:thin:@oracle12c-srv:1521:oracle12c","java","java");
			System.out.println("connection established");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
