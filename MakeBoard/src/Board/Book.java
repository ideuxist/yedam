package Board;

public class Book {

	private String bookName;
	private String writer;
	private String publisher;
	private int bookPrice;
	private String rentalPossible;
	private String rentName;
	private String rentDate;
	private String returnDate;
	 
	Book () {}
 
	public Book(String bookName,String writer, String publisher, int bookPrice, String rentalPossible) {
		super();
		this.bookName = bookName;
		this.writer = writer;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
		this.rentalPossible = rentalPossible; 
	}
	
	public Book(String bookName, String writer, String publisher, int bookPrice, String rentalPossible,
			String rentName, String rentDate, String returnDate) {
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
		return "Book [책제목: " + bookName + ", 저자: " + writer + ", 출판사: " + publisher + ", 가격: "
				+ bookPrice + ", 대여가능여부: " + rentalPossible + ", 대여자이름: " + rentName + ", 대여일: " + rentDate
				+ ", 반납예정일: " + returnDate + "]";
	}
	
	
 
}