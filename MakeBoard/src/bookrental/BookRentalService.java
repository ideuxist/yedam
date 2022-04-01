package bookrental;

import java.util.List;

public interface BookRentalService {
	
	public void registBook(Book book);//도서등록 o
	public  List<Book> listup(); //리스트 출력 o
	public List<Book> searchBook(String bookName); //제목조회
	public void modifyBook(Book book); //책정보 수정
	public void deleteBook(String bookName); //도서 삭제
	public void rentalBook(String bookName); //도서대여
	public void returnBook(); //도서반납 
	public boolean memberCheck(BookMember member); //로그인 아이디 체크
	
	
 
	
	
	
	
}
