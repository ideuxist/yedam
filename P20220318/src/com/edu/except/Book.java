package com.edu.except;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
		
	}
	
	public void showInfo() {
		System.out.println("========================");
		System.out.println("å ����: "+this.title+",���ڴ� " +this.author+ ",������ "+price+"�Դϴ�");
		System.out.println("========================");

	}
	
}
