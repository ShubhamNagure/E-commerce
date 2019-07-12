package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login {
	public static boolean isAuthenticateUser(String email,String password) {
		boolean result=false;
		try {
		Connection con= ConnectionDatabase.getOracleConnection();
		String sql="select password from User_Amazon where email=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, email);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			if(password==password) {
				result=true;
				System.out.println("welcome,your password is correct");
			}else {
				result=false;
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	

}
