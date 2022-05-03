package co.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	// DriverManager
			public Connection conn;
			public Statement stmt;
			public ResultSet rs;
			public PreparedStatement psmt;

			public Connection getConn() {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("연결성공");
				return conn;

			}

			public void disconn() {
				try {
					if (rs != null)
						rs.close();
					if (stmt != null)
						stmt.close();
					if (psmt != null)
						psmt.close();

					if (conn != null)
						conn.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

}
