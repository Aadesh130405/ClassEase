package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHandling2 {
	
		PreparedStatement pstmt=null;
		Statement stmt;
		Connection con=null;
		public JDBCHandling2() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Get class");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/announcement","root","Aadesh130405");
				System.out.println("Get connection");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	

	public int postAnnouncement(String message) {
	    int status = 0;
	    try {
	    	
	        pstmt = con.prepareStatement("INSERT INTO announcement (message) VALUES (?)");
	        pstmt.setString(1, message);
	        status = pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return status;
	}
	
	public String getLatestAnnouncement() {
        String announcement = "No announcements.";
        try {
            String sql = "SELECT message FROM announcement ORDER BY id DESC LIMIT 1";
            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                announcement = rs.getString("message");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return announcement;
    }

}
