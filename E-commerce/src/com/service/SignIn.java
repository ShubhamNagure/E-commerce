package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignIn {
	
	public static void registerUser(String customerName, String email,String password) {
		try {
			Connection con=ConnectionDatabase.getOracleConnection();
			String query= "insert into User_Amazon(userId,customerName,email,password)values (seq_userid.nextval,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1, customerName);
			pst.setString(2, email);
			pst.setString(3, password);
			System.out.println("user successfully registerd");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
