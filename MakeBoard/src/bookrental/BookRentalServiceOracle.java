package bookrental;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class BookRentalServiceOracle extends BookDAO implements BookRentalService {

	@Override
	public boolean memberCheck(BookMember member) {
		conn = getConnect();
		String sql = "select member_id,member_password " + "from book_member_info "
				+ "where member_id=? and member_password=?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				BookMember member2 = new BookMember();
//				member2.setMemberId(rs.getString("member_id"));
//				member2.setMemberPassword(rs.getString("member_password"));
//				System.out.println(member2.toString());
//				
//				if (member.equals(member2)) {
//					System.out.println("관리자로 로그인 되었습니다");
//				} else {
//					System.out.println("다시 로그인 해주세요");
//				}
//				

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getMemberId());
			psmt.setString(2, member.getMemberPassword());
			rs = psmt.executeQuery();
			if (rs.next()) {
//				if ((rs.getString("member_id")).equals(member.getMemberId())
//						&& ((rs.getString("member_password")).equals(member.getMemberPassword())))
//				{
//					System.out.println("관리자로 로그인되었습니다");

				// System.out.println("로그인 성공");
				return true;
			} else {
				System.out.println("아이디 혹은 비밀번호가 잘못되었습니다");
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			disconnect();
		}

	}

	@Override
	public void registBook(Book book) {
		conn = getConnect();
		String sql = "insert into book_info (book_name,writer,publisher,book_price,rental_possible)\r\n"
				+ "values(?, ?, ? ,? , ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookName());
			psmt.setString(2, book.getWriter());
			psmt.setString(3, book.getPublisher());
			psmt.setInt(4, book.getBookPrice());
			psmt.setString(5, book.getRentalPossible());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public List<Book> listup() {
		List<Book> list = new ArrayList<Book>();
		conn = getConnect();
		String sql = "select * from book_info order by book_name";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setWriter(rs.getString("writer"));
				book.setPublisher(rs.getString("publisher"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setRentalPossible(rs.getString("rental_possible"));
				book.setRentName(rs.getString("rent_name"));
				book.setRentDate(rs.getString("rent_date"));
				book.setReturnDate(rs.getString("return_date"));
				list.add(book);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public List<Book> searchBook(String bookName) {
		List<Book> list = new ArrayList<Book>();
		Book book = null;
		conn = getConnect();

		String sql = "select * from book_info where book_name like '%" + bookName + "%'";

		try {
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {

				book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setWriter(rs.getString("writer"));
				book.setPublisher(rs.getString("publisher"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setRentalPossible(rs.getString("rental_possible"));
				book.setRentName(rs.getString("rent_name"));
				book.setRentDate(rs.getString("rent_date"));
				book.setReturnDate(rs.getString("return_date"));
				list.add(book);
				i = i + 1;
			}
			if (i > 0) {
				System.out.println(i + "건 조회결과가 있습니다");
			} else {
				System.out.println("조회된 결과가 없습니다");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public List<Book> searchBook2(String bookName) {
		List<Book> list = new ArrayList<Book>();
		Book book = null;
		conn = getConnect();
		String bookname = null;
		String writer = null;
		String publisher = null;
		int bookPrice = 0;
		String rentalPossible = null;
		String sql = "select * from book_info where book_name like '%" + bookName + "%'";

		try {
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {

				book = new Book(bookname, writer, publisher, bookPrice, rentalPossible);
				book.setBookName(rs.getString("book_name"));
				book.setWriter(rs.getString("writer"));
				book.setPublisher(rs.getString("publisher"));
				book.setBookPrice(rs.getInt("book_price"));
				book.setRentalPossible(rs.getString("rental_possible"));

				list.add(book);
				i = i + 1;
			}
			if (i > 0) {
				System.out.println(i + "건 조회결과가 있습니다");
			} else {
				System.out.println("조회된 결과가 없습니다");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifyBook(Book book) {
		conn = getConnect();
		String sql = "update book_info\r\n" + "set book_name = ? , writer = ? , \r\n"
				+ "publisher = ?, book_price = ? ,rental_possible= ?,\r\n"
				+ "rent_name = ? , rent_date = ? , return_date= ?" + "where book_name= ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookName());
			psmt.setString(2, book.getWriter());
			psmt.setString(3, book.getPublisher());
			psmt.setInt(4, book.getBookPrice());
			psmt.setString(5, book.getRentalPossible());
			psmt.setString(6, book.getRentName());
			psmt.setString(7, book.getRentDate());
			psmt.setString(8, book.getReturnDate());
			psmt.setString(9, book.getBookName());

			psmt.executeUpdate();
			System.out.println(book.getBookName() + "(이)가 수정되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void deleteBook(String bookName) {
		conn = getConnect();
		String sql = "delete book_info where book_name = ? ";
		String sql2 = "select * from book_info where book_name =?";;
		try {

			while (true) {
				psmt = conn.prepareStatement(sql2);
				psmt.setString(1, bookName);
				rs = psmt.executeQuery();
				if (rs.next()) {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, bookName);
					psmt.executeUpdate();
					System.out.println(bookName + "정보가 삭제되었습니다");
				} else {
					System.out.println("책이름을 다시 한번 확인해주세요");
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void rentalBook(Book book) {
		conn = getConnect();
		String sql = "update book_info\r\n" + "set rental_possible= ?,\r\n"
				+ "rent_name = ? , rent_date = ? , return_date= ?" + "where book_name= ?";
		String sql2 = "select * from book_info where book_name =?";
//		psmt = conn.prepareStatement(sql);
//		psmt.setString(1, member.getMemberId());
//		psmt.setString(2, member.getMemberPassword());
//		rs = psmt.executeQuery();
		try {

			while (true) {
				psmt = conn.prepareStatement(sql2);
				psmt.setString(1, book.getBookName());
				rs = psmt.executeQuery();
				if (rs.next()) {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, "n");
					psmt.setString(2, book.getRentName());
					psmt.setString(3, book.getRentDate());
					psmt.setString(4, book.getReturnDate());
					psmt.setString(5, book.getBookName());
					psmt.executeUpdate();
					System.out.println(book.getBookName() + "을(를) 대여처리 하였습니다");
					break;
				} else {
					System.out.println("잘못입력하셨습니다 다시 확인해주세요");
					break;
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void returnBook(Book book) {
		conn = getConnect();
		String sql = "update book_info\r\n" + "set rental_possible= ?,\r\n"
				+ "rent_name = ? , rent_date = ? , return_date= ?" + "where book_name= ?";
		String sql2 = "select * from book_info where book_name =?";
		try {

			while (true) {
				psmt = conn.prepareStatement(sql2);
				psmt.setString(1, book.getBookName());
				rs = psmt.executeQuery();
				if (rs.next()) {
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, "y");
					psmt.setString(2, book.getRentName());
					psmt.setString(3, book.getRentDate());
					psmt.setString(4, book.getReturnDate());
					psmt.setString(5, book.getBookName());
					psmt.executeUpdate();
					System.out.println(book.getBookName() + "을(를) 반납처리 하였습니다");
					break;
				} else {
					System.out.println("잘못입력하셨습니다 다시 확인해주세요");
					break;
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void joinBookMember(BookMember bookMember) {
		conn = getConnect();
		String sql = "insert into book_member_info " + "(member_id,member_password,member_phone)\r\n"
				+ "values(?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookMember.getMemberId());
			psmt.setString(2, bookMember.getMemberPassword());
			psmt.setString(3, bookMember.getPhoneNumber());
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public List<BookMember> memberlistup() {
		List<BookMember> list = new ArrayList<BookMember>();
		conn = getConnect();
		String sql = "select * from book_member_info order by member_id";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BookMember bookMember = new BookMember();
				bookMember.setMemberId(rs.getString("member_id"));
				bookMember.setMemberPassword(null);
				bookMember.setPhoneNumber(rs.getString("member_phone"));

				list.add(bookMember);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

}
