package com.Assignment;

import java.sql.*;



public class jdbc3 {

	

	public static void main(String[] args)  {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry ="select * from emp where eid=123" ;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment3?user=root & password=karanthakur");
		
		pstmt = (PreparedStatement) con.prepareStatement(qry);
		
		
		rs = pstmt.executeQuery();
		if(rs.next()) {
			String ename = rs.getString(1);
			int sal = rs.getInt(2);
			String EmailId = rs.getString(3);
			int eid = rs.getInt(4);
			System.out.println(ename + " " + sal + " " + EmailId + " " +eid );
		}
		else {
			System.out.println(" ");
		}
		}
		catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
	}
		}