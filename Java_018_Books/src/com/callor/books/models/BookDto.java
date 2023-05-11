package com.callor.books.models;

/*
 * 데이터 추상화
 * 일상의 데이터를 컴퓨터를 사용하여 정보처리를 하려고 할때
 * 일상의 데이터를 필요한 속성들(요소들)만 추출하는 과정
 * 
 * 추상화된 데이터를 모델링(데이터 클래스 디자인)
 * 추상화된 데이터 요소의 type 을 지정하기
 * 		페이지, 가격 항목은 정수형으로
 * 		나머지 항목은 문자열형으로 하자
 * 
 * 모델링된 데이터를 실제 클래스로 구현하기
 * 		각 데이터 요소의 변수 이름을 설정하기
 * 		ISBN(bIsbn), 도서명(bTitle), 출판사(bPublisher)
 * 		저자(bAuthor), 발행일(bPublishDate)
 * 		페이지(bPages), 가격(bPrice)
 * 
 * OOP 에서 데이터 클래스에 어떤 패턴을 지정할 것인가
 * 		요즘의 Java 에서는 데이터 클래스의 각 속성(요소, Field)의
 * 		접근 제한자를 public 으로 선언한다
 * 
 * 		Web Application Service프로젝트를 구현할때
 * 		특히 SpringMVC 도구를 사용하여 구현할때 는
 * 		접근 제한자를 private 으로 선언하고
 * 		각 속성의 접근을 하기위해 getter, setter method 를 선언하는
 * 		패턴을 사용한다.
 * 
 */

// ISBN,도서명,출판사,저자,발행일,페이지,가격
public class BookDto {
	
	/*
	 * 데이터 클래스 생성할때
	 * 변수명 또는 변수의 type 을 변경하고자 할때
	 * 		getter, setter, toString, 생성자2개 를 모두 지우고
	 * 변수명 또는 변수의 type 을 변경하고
	 *  	getter, setter, toString, 생성자2개 를 다시 생성하자
	 *  
	 * 변수명을 수정하고, getter, setter 등을 수정해 주어야 하는데
	 * 그러는 과정에서 수정을 빼먹는 상황이 발생할수 있다
	 * 
	 * 코드를 reFactoring 할때 가장 많은 문제를 발생시킬수 있다
	 * reFactoring 을 할때 가장 좋은 것은 최소한의 코드 수정이다
	 */
	private String bIsbn;
	private String bTitle;
	private String bPublisher;
	private String bAuthor;
	private String bPublishDate;
	private int bPages;
	private int bPrice;
	
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDto(String bIsbn, String bTitle, String bPublisher, String bAuthor, String bPublishDate, int bPages,
			int bPrice) {
		super();
		this.bIsbn = bIsbn;
		this.bTitle = bTitle;
		this.bPublisher = bPublisher;
		this.bAuthor = bAuthor;
		this.bPublishDate = bPublishDate;
		this.bPages = bPages;
		this.bPrice = bPrice;
	}
	public String getbIsbn() {
		return bIsbn;
	}
	public void setbIsbn(String bIsbn) {
		this.bIsbn = bIsbn;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbPublisher() {
		return bPublisher;
	}
	public void setbPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbPublishDate() {
		return bPublishDate;
	}
	public void setbPublishDate(String bPublishDate) {
		this.bPublishDate = bPublishDate;
	}
	public int getbPages() {
		return bPages;
	}
	public void setbPages(int bPages) {
		this.bPages = bPages;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "BookDto [bIsbn=" + bIsbn + ", bTitle=" + bTitle + ", bPublisher=" + bPublisher + ", bAuthor=" + bAuthor
				+ ", bPublishDate=" + bPublishDate + ", bPages=" + bPages + ", bPrice=" + bPrice + "]";
	}
	
}
