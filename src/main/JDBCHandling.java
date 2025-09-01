package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JDBCHandling {
	Connection con=null;
	PreparedStatement pstmt=null;
	Statement stmt;
	ResultSet result;
	JDBCHandling(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("get class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studenttable","root","Aadesh130405");
			System.out.println("get connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	int insertData(String name,long mobile,String address,String gender,String degree,String dob,String subject1,String subject2) {
		int status=0;
		try {
			pstmt = con.prepareStatement("INSERT INTO studenttable VALUES (default,?, ?, ?, ?, ?, ?, ?, ?)");

			pstmt.setString(1, name);
			pstmt.setLong(2, mobile);
			pstmt.setString(3, address);
			pstmt.setString(4, gender);
			pstmt.setString(5, degree);
			pstmt.setString(6, dob);
			pstmt.setString(7, subject1);
			pstmt.setString(8, subject2);
			
			status=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	ResultSet getTable() {
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result=stmt.executeQuery("select * from studenttable");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	ResultSet getRow(int ID) {
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from studenttable where id= "+ID;
		try {
			result=stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	int insertUpdate(String name,long mobile,String address,String gender,String degree,String dob,String subject1,String subject2,int id) {
		int status=0;
		try {
			pstmt = con.prepareStatement("update studenttable set name=?, mobile=?,address= ?, gender=?, degree=?, dob=?, subject1=?, subject2=? where id=?");

			pstmt.setString(1, name);
			pstmt.setLong(2, mobile);
			pstmt.setString(3, address);
			pstmt.setString(4, gender);
			pstmt.setString(5, degree);
			pstmt.setString(6, dob);
			pstmt.setString(7, subject1);
			pstmt.setString(8, subject2);
			pstmt.setInt(9, id);
			
			status=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	int deleteUpdate(int id) {
		int status=0;
		try {
			pstmt=con.prepareStatement("delete from studenttable where id=?");
			pstmt.setInt(1, id);
			status=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	

}
