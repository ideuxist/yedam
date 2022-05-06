package co.dev.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

public class MemberDAO extends DAO {
	
	
	public void memberDelete(String id) {
		conn=getConn();
		String sql = "delete from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r+"건 삭제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconn();
			
		}
		
	}
	
	public void memberUpdata(MemberVO member) {
		conn = getConn();
		String sql = "update member set name=?,email=?,passwd=? where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getName());
			psmt.setString(2, member.getEmail());
			psmt.setString(3, member.getPasswd());
			psmt.setString(4, member.getId());
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconn();
		}
	}
	
	
	public void updateMember(MemberVO vo) {
		
		
	}
	
	public void deleteMember(String id) {
		
	}
	
	public MemberVO serchMember(String id) {
		conn = getConn();
		String sql = "select * from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setPasswd(rs.getString("passwd"));
				return vo;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconn();
			
		}
		return null;
		
		
	}
	
	public List<MemberVO> listMember(){
		conn=getConn();
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			psmt = conn.prepareStatement("select * from member order by id");
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setProfile(rs.getString("profile"));
				list.add(vo);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
	public void insertMember(MemberVO member) {
		conn = getConn();
		String sql = "insert into member(id,name,passwd,email,profile) values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2,member.getName());
			psmt.setString(3,member.getPasswd());
			psmt.setString(4,member.getEmail());
			psmt.setString(5,member.getProfile());
			int r = psmt.executeUpdate();
			System.out.println(r+"건 입력");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
