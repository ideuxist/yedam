package com.prod;

public class BookExample {

	public static void main(String[] args) {
		// 책(제목, 저자, 출판사, 가격)
		//book1=> 초기화 :혼공자, 신용권,한빛미디어,24000원
		//book2=> 초기화 :powerJava, 전인국, 인피니티, 35000원
		//book3=> 초기화 :재미있는 Java, 이호준, 인피니티, 20000원
		//출판사 => 인피니티인 책만 출력
		//제목,저자,가격=>출력
		
		Book[] books;
		
		Book book1 = new Book();
		book1.bookName = "혼공자";
		book1.writerName = "신용권";
		book1.publisher = "한빛미디어";
		book1.price = 24000;
		
		Book book2 = new Book();
		book2.bookName = "powerJava";
		book2.writerName = "전인국";
		book2.publisher = "인피니티";
		book2.price = 35000;
		
		Book book3 = new Book();
		book3.bookName = "재미있는 Java";
		book3.writerName = "이호준";
		book3.publisher = "인피니티";
		book3.price = 20000;
	 
		books= new Book[] {book1, book2, book3};
		
		for ( int i=0; i<books.length;i++) {
			if (books[i].publisher.equals("인피니티")) {
				System.out.println(books[i].bookName);
				System.out.println(books[i].writerName);
				System.out.println(books[i].price);
			}
		}
	}

}
//출판사 => 인피니티인 책만 출력
		//제목,저자,가격=>출력
		