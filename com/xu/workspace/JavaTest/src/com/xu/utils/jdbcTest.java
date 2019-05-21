package com.xu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class jdbcTest {
	
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydata";
		String user = "root";
		String password = "123456";
		
		Connection con = null;
		PreparedStatement p = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM tables1";
			p = con.prepareStatement(sql);
			rs = p.executeQuery();
			ResultSetMetaData data = rs.getMetaData();
			while(rs.next()){
				for(int i=1;i<=data.getColumnCount();i++){
					String name = data.getColumnName(i);
					System.out.println(name);
				}
			}
			System.out.println(data.getColumnCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				p.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
