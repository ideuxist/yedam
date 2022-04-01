package bookrental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookApp {
	List<Book> list = new ArrayList<Book>();
	Scanner scn = new Scanner(System.in);

	public BookApp() {
	}

	public void execute() {

		BookRentalService service = new BookRentalServiceOracle();

		while (true) {

			System.out.println("1.관리자 로그인 2.책 대여 3.책 반납 0.프로그램종료");
			int login = scn.nextInt();
			if (login == 1) {
				System.out.println("관리자 ID>");
				String memberId = scn.next();
				System.out.println("비밀번호");
				String memberPassword = scn.next();

				BookMember member = new BookMember();
				member.setMemberId(memberId);
				member.setMemberPassword(memberPassword);
				//System.out.println(member.toString());
				
				
				if (service.memberCheck(member) == true) {
					while(true) {
					System.out.println("메뉴:1.도서등록 2.도서 목록 3.도서 찾기 4.도서 수정 5.도서 삭제 6.대여  7.반납 0. 돌아가기");
					System.out.println("메뉴선택>");
					int menu = scn.nextInt();

					if (menu == 1) {
						// 도서등록
						System.out.println("책제목 입력>");
						String bookName = scn.next();
						System.out.println("저자 입력>");
						String writer = scn.next();
						System.out.println("출판사 입력>");
						String publisher = scn.next();
						System.out.println("가격 입력>");
						int bookPrice = scn.nextInt();
						System.out.println("대여가능여부 입력>");
						String rentalPossible = scn.next();

						Book book = new Book(bookName, writer, publisher, bookPrice, rentalPossible);

						service.registBook(book);

					} else if (menu == 2) {
						System.out.println("등록된 도서 전체보기");
						List<Book> list = service.listup();
						for (Book b : list) {
							System.out.println(b.toString());
						}

					} else if (menu == 3) {
						// 도서찾기
						System.out.println("책 제목으로 검색>");
						String bookName = scn.next();
						List<Book> list = service.searchBook(bookName);

						for (Book b : list) {
							System.out.println(b.toString());

						}

					} else if (menu == 4) {
						// 도서정보수정
						System.out.println("책제목 입력>");
						String bookName = scn.next();
						System.out.println("저자 입력>");
						String writer = scn.next();
						System.out.println("출판사 입력>");
						String publisher = scn.next();
						System.out.println("가격 입력>");
						int bookPrice = scn.nextInt();
						System.out.println("대여가능여부 입력>");
						String rentalPossible = scn.next();
						System.out.println("대여자 이름 입력>");
						String rentName = scn.next();
						System.out.println("대여일 입력");
						String rentDate = scn.next();
						System.out.println("반납예정일 입력");
						String returnDate= scn.next();
						Book book = new Book(bookName, writer, publisher, bookPrice
								, rentalPossible,rentName,rentDate,returnDate);
						service.modifyBook(book);
						
						
						
						

					} else if (menu == 5) {
						System.out.println("삭제하실 책 제목을 입력하세요");
						String bookName = scn.next();
						service.deleteBook(bookName);

					} else if (menu == 6) {
						System.out.println("대여하실 책 제목을 입력하세요");
						String bookName = scn.next();
						service.rentalBook(bookName);

					} else if (menu == 7) {
						// 반납기능
					} else {
						System.out.println("로그인메뉴로 돌아갑니다");
						break;
					}

				}
				}

				// 관리자 로그인실패//
				else {
					System.out.println("다시 시도하여 주세요");
				}

			} else if (login == 2) {
				System.out.println("회원 아이디입력");
				String memberId = scn.next();
				System.out.println("비밀번호");
				String memberPassword = scn.next();
			} else {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}
	}

}
