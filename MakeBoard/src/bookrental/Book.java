package bookrental;

public class Book {

	private String bookName;
	private String writer;
	private String publisher;
	private int bookPrice;
	private String rentalPossible;
	private String rentName;
	private String rentDate;
	private String returnDate;

	Book() {
	}

	Book(String bookName, String rentName, String rentDate, String returnDate) {
		this.bookName = bookName;
		this.rentName = rentName;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	public Book(String bookName, String writer, String publisher, int bookPrice, String rentalPossible) {
		super();
		this.bookName = bookName;
		this.writer = writer;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
		this.rentalPossible = rentalPossible;
	}

	public Book(String bookName, String writer, String publisher, int bookPrice, String rentalPossible, String rentName,
			String rentDate, String returnDate) {
		super();
		this.bookName = bookName;
		this.writer = writer;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
		this.rentalPossible = rentalPossible;
		this.rentName = rentName;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getRentalPossible() {
		return rentalPossible;
	}

	public void setRentalPossible(String rentalPossible) {
		this.rentalPossible = rentalPossible;
	}

	public String getRentName() {
		return rentName;
	}

	public void setRentName(String rentName) {
		this.rentName = rentName;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		//return String.format("%s\t%3d\t%s", fullName, relativeScore, testScore); 
		//int a,b,c,d,e,f,g,h;
//		String result ="[책제목: " + bookName + ", 저자: " + writer + "     , 출판사: " + publisher + ", 가격: " + bookPrice
//				      + ", 대여가능여부: " + rentalPossible + ", 대여자이름: " + rentName + ", 대여일: " + rentDate + ", 반납예정일: "
//				      + returnDate + "]";
		 return String.format("책제목 :%-15s저자 :%-8s출판사 :%-8s가격: %-8d대여가능여부 :%-2s대여자이름 : %-10s대여일 : %-30s반납예정일 : %-30s" 
				 ,bookName,writer,publisher,bookPrice,rentalPossible,rentName,rentDate,returnDate);
	}

	public String toString2() {
		return "[책제목: " + bookName + ", 저자: " + writer + ", 출판사: " + publisher + ", 가격: " + bookPrice + ", 대여가능여부: "
				+ rentalPossible + "]";
	}

}