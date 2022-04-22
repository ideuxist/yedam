package bookrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement; 

public class BookDAO {
	// DriverManager
		Connection conn;
		Statement stmt; 
		ResultSet rs;
		PreparedStatement psmt;

		public Connection getConnect() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.3:1521:xe", "hr", "hr");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("=====================>");
			return conn;

		}

		public void disconnect() {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();
				System.out.println("<=====================");
				

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
