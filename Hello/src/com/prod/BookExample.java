package com.prod;

public class BookExample {

	public static void main(String[] args) {
		// å(����, ����, ���ǻ�, ����)
		//book1=> �ʱ�ȭ :ȥ����, �ſ��,�Ѻ��̵��,24000��
		//book2=> �ʱ�ȭ :powerJava, ���α�, ���Ǵ�Ƽ, 35000��
		//book3=> �ʱ�ȭ :����ִ� Java, ��ȣ��, ���Ǵ�Ƽ, 20000��
		//���ǻ� => ���Ǵ�Ƽ�� å�� ���
		//����,����,����=>���
		
		Book[] books;
		
		Book book1 = new Book();
		book1.bookName = "ȥ����";
		book1.writerName = "�ſ��";
		book1.publisher = "�Ѻ��̵��";
		book1.price = 24000;
		
		Book book2 = new Book();
		book2.bookName = "powerJava";
		book2.writerName = "���α�";
		book2.publisher = "���Ǵ�Ƽ";
		book2.price = 35000;
		
		Book book3 = new Book();
		book3.bookName = "����ִ� Java";
		book3.writerName = "��ȣ��";
		book3.publisher = "���Ǵ�Ƽ";
		book3.price = 20000;
	 
		books= new Book[] {book1, book2, book3};
		
		for ( int i=0; i<books.length;i++) {
			if (books[i].publisher.equals("���Ǵ�Ƽ")) {
				System.out.println(books[i].bookName);
				System.out.println(books[i].writerName);
				System.out.println(books[i].price);
			}
		}
	}

}
//���ǻ� => ���Ǵ�Ƽ�� å�� ���
		//����,����,����=>���
		