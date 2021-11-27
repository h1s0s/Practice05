package com.javaex.ex10;

public class Book {
    
	//필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;//int니까 1이면 재고있음 0이면 대여중
	
    //생성자
	public Book() {
		
	}
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode++;
	}
	
	//메소드 g-s
	public int getBookNo() {
		return bookNo;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	//메소드 일반
    public void rent() {//대여기능을 수행하는 메소드
    		System.out.println("\""+title+"\""+"이(가) 대여되었습니다.");
    		--stateCode;
    }
    public void print() {//책의 정보를 출력하는 메소드.
    		if(stateCode == 1) {//재고있음
    			System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무: 재고있음");
    		} else {
    			System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무: 대여중");
    	}
    }
}
