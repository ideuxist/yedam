package bookrental;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRentalServiceOracle extends BookDAO implements BookRentalService {

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
		
		String sql = "select * from book_info where book_name like '%"+bookName+"%'";
				
		try {
			psmt = conn.prepareStatement(sql);
		
			rs = psmt.executeQuery();
			int i = 0;
			while(rs.next()) { 
				
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
				i=i+1;
			}if (i>0) {
				System.out.println(i+"건 조회결과가 있습니다");
			}else {
				System.out.println("조회된 결과가 없습니다");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifyBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rentalBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub

	}

}
