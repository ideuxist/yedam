package bookrental;

import java.util.List;

public interface BookRentalService {
	
	public void registBook(Book book);//도서등록 o
	public  List<Book> listup(); //리스트 출력 o
	public List<Book> searchBook(String bookName); //제목으로조회-관리자전용
	public List<Book> searchBook2(String bookName); //제목으로 조회-회원전용
	public void modifyBook(Book book); //책정보 수정
	public void deleteBook(String bookName); //도서 삭제
	public void rentalBook(Book book); //도서대여
	public void returnBook(Book book); //도서반납 
	public boolean memberCheck(BookMember member); //로그인 아이디 체크
	public void joinBookMember(BookMember bookMember); //회원가입
	public  List<BookMember> memberlistup(); //회원 리스트 출력 
	
	
	
 
	
	
	
	
}
