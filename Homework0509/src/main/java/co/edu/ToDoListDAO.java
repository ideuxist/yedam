package co.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToDoListDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	//한건입력
	public void insert(String insert) {
		String sql = "insert into todolist (todo) values(?)";
		getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,insert);
			int r = psmt.executeUpdate();
			System.out.println(r+"건입력");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
	}
	
	
	//한건 삭제
	public void delete(String del) {
		String sql = "delete from todolist where todo = ?";
		getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, del);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
	}
		
	
	
	//리스트
	public List<ToDoList> getList(){
		String sql = "select * from todolist";
		getConnect();
		List<ToDoList> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) {
				ToDoList todo = new ToDoList(
						rs.getString("todo")
						);
				list.add(todo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disConnect();
		}
					return list;
		}
		
	public void getConnect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.3:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void disConnect() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



