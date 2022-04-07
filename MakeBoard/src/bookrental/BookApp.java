package bookrental;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
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
			int login;
			System.out.println("1.관리자 로그인 2.회원 로그인 3.회원가입 0.프로그램종료 \n"
					+"관리자 admin/admin 회원 test/1111");
			try {
				login = scn.nextInt();
				scn.nextLine();
				
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				scn.nextLine();
				
				continue;
			}
			
			if (login == 1) {
				System.out.println("관리자 ID>");
				String memberId = scn.next();
				System.out.println("비밀번호");
				String memberPassword = scn.next();

				BookMember member = new BookMember();
				member.setMemberId(memberId);
				member.setMemberPassword(memberPassword);
				// System.out.println(member.toString());

				if (service.memberCheck(member) == true && memberId.equals("admin")) {
					System.out.println("관리자로 접속하셨습니다");
					while (true) {
						
						try {
						System.out.println("메뉴:1.도서등록 2.도서 목록 3.도서 찾기 4.도서 수정 5.도서 삭제 6.대여  7.반납 8.회원 조회 0. 돌아가기");
						System.out.println("메뉴선택>");
						int menu = scn.nextInt();
						scn.nextLine();
						// System.out.println(str);
						if (menu == 1) {
							// 도서등록
							System.out.println("책제목 입력>");
							String bookName = scn.nextLine();
							System.out.println("저자 입력>");
							String writer = scn.nextLine();
							System.out.println("출판사 입력>");
							String publisher = scn.nextLine();
							int bookPrice = 0;

							while (true) {

								System.out.println("가격 입력>");
								try {
									bookPrice = scn.nextInt();
									scn.nextLine();
									break;
								} catch (InputMismatchException e) {
									System.out.println("숫자만 입력하세요");
									scn.nextLine();
									continue;
								}

							}
							String rentalPossible;
							while (true) {
								System.out.println("대여가능여부 입력>");
								rentalPossible = scn.nextLine();
								char yOrn = rentalPossible.charAt(0);
								System.out.println(yOrn);
								if ((yOrn == 'Y' || yOrn == 'y' || yOrn == 'N' || yOrn == 'n')) {
									break;
								} else {
									System.out.println("가능시 Y or y 불가시 N or n 정확히 입력해주세요");

									continue;
								}
							}

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
							String bookName = scn.nextLine();
							List<Book> list = service.searchBook(bookName);

							for (Book b : list) {
								System.out.println(b.toString());

							}

						} else if (menu == 4) {
							// 도서정보수정
							System.out.println("책제목 입력>");
							String bookName = scn.nextLine();
							System.out.println("저자 입력>");
							String writer = scn.nextLine();
							System.out.println("출판사 입력>");
							String publisher = scn.nextLine();
							System.out.println("가격 입력>");
							int bookPrice = scn.nextInt();
							scn.nextLine();
							System.out.println("대여가능여부 입력>");
							String rentalPossible = scn.nextLine();
							System.out.println("대여자 이름 입력>");
							String rentName = scn.nextLine();
							System.out.println("대여일 입력");
							String rentDate = scn.nextLine();
							System.out.println("반납예정일 입력");
							String returnDate = scn.nextLine();
							Book book = new Book(bookName, writer, publisher, bookPrice, rentalPossible, rentName,
									rentDate, returnDate);
							service.modifyBook(book);

						} else if (menu == 5) {
							System.out.println("삭제하실 책 제목을 입력하세요");
							String bookName = scn.nextLine();
							service.deleteBook(bookName);

						} else if (menu == 6) {
							System.out.println("대여하실 책 제목을 입력하세요");
							String bookName = scn.nextLine();
							System.out.println("대여자 아이디를 입력하세요");
							String rentName = scn.nextLine();
							Calendar cal = Calendar.getInstance();
							Date d = new Date(cal.getTimeInMillis());
							SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
							String rentDate = formatter.format(d);
							Calendar cal2 = Calendar.getInstance();
							cal2.add(Calendar.DATE, 5);
							Date d2 = new Date(cal2.getTimeInMillis());
							String returnDate = formatter.format(d2);
							Book book = new Book(bookName, rentName, rentDate, returnDate);
							service.rentalBook(book);

						} else if (menu == 7) {
							// 반납기능

							System.out.println("반납하실 책 제목을 입력하세요");
							String bookName = scn.next();
							String rentName = null;
							String rentDate = null;
							String returnDate = null;
							Book book = new Book(bookName, rentName, rentDate, returnDate);
							service.returnBook(book);

						} else if (menu == 8) {
							// 회원 조회
							List<BookMember> list = service.memberlistup();
							for (BookMember bm : list) {
								System.out.println(bm.toString2());

							}
						}

						else {
							System.out.println("로그인메뉴로 돌아갑니다");
							break;
						}

					
				

				
				} catch (InputMismatchException e) {
					scn.nextLine();
					System.out.println("다시 입력해주세요");
					continue;
					
				}
				
				}
			}
			
			else {
					System.out.println("아이디 비번을 확인해주세요");
				}

			} else if (login == 2) {
				System.out.println("회원 아이디입력");
				String memberId = scn.nextLine();
				System.out.println("비밀번호");
				String memberPassword = scn.nextLine();

				BookMember member = new BookMember();
				member.setMemberId(memberId);
				member.setMemberPassword(memberPassword);

				if (service.memberCheck(member) == true && !memberId.equals("admin")) {
					int menu;
					
						try {

							System.out.println("1.대여 2.반납 3.책 조회 0.돌아가기");
							switch (menu = scn.nextInt()) {
							case 1:
								scn.nextLine();
								System.out.println("대여하실 책 제목을 입력하세요");
								String bookName = scn.nextLine();
								Calendar cal = Calendar.getInstance();
								Date d = new Date(cal.getTimeInMillis());
								SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
								String rentDate = formatter.format(d);
								Calendar cal2 = Calendar.getInstance();
								cal2.add(Calendar.DATE, 5);
								Date d2 = new Date(cal2.getTimeInMillis());
								String returnDate = formatter.format(d2);
								Book book = new Book(bookName, memberId, rentDate, returnDate);
								service.rentalBook(book);
								break;
							case 2:
								scn.nextLine();
								System.out.println("반납하실 책 제목을 입력하세요");
								bookName = scn.nextLine();
								memberId = null;
								rentDate = null;
								returnDate = null;
								Book book2 = new Book(bookName, memberId, rentDate, returnDate);
								service.returnBook(book2);
								break;
							case 3:
								scn.nextLine();
								System.out.println("책 제목으로 검색>");
								bookName = scn.nextLine();
								List<Book> list = service.searchBook2(bookName);

								for (Book b : list) {
									System.out.println(b.toString2());
								}
								break;
							case 0:
								break;
							default:
								break;

							}//switch문 종료
						
						} catch (InputMismatchException e) {
							scn.nextLine();
							System.out.println("메뉴를 정확히 선택해주세요");
							continue;
						}
						
						
					//while문 종료

				} else {
					System.out.println("아이디 비번을 확인해주세요");
				}
			}

			else if (login == 3) {
				// 회원가입
				while (true) {
					System.out.println("가입하실 아이디를 입력하세요");
					String memberId = scn.nextLine();
					System.out.println("연락처를 입력해 주세요");
					String memberPhoneNumber = scn.nextLine();
					System.out.println("사용하실 비밀번호를 입력하세요");
					String memberPassword = scn.nextLine();
					System.out.println("다시 한번 비밀번호를 입력하세요");
					String memberPassword2 = scn.nextLine();
					if (memberPassword.equals(memberPassword2)) {
						BookMember bookMember = new BookMember(memberId, memberPassword, memberPhoneNumber);
						service.joinBookMember(bookMember);
						System.out.println("가입이 되었습니다");
						break;
					} else {
						System.out.println("입력하신 비밀번호가 다릅니다 다시 시도해주세요");

					}
				}

			} else if (login == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				continue;
			}

		}
	}

}
