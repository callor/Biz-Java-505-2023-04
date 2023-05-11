package com.callor.books.service;

import java.util.List;

import com.callor.books.models.BookDto;

/*
 * interface( class ) 작성하기
 * 업무의 추상화
 * BookDto 데이터 클래스를 작성한 후
 * 도서정보 서비스를 구현하기 위해서 어떤 업무(Business logic)가
 * 필요한가를 결정하는 것
 *   
 * CREATE(데이터생성) 
 * 		: 도서정보.txt 파일을 열어서 도서정보 List 데이터 만들기
 * 			loadBooks() method 로 구현
 * 
 * READ(데이터조회)
 * 		: 도서정보 List 를 화면에 출력해 보기, 전체데이터 조회하기
 * 			printBookList() method 로 구현
 * 
 * 		: 도서 ISBN으로 개별 도서의 정보 조회하기, 개별정보 조회하기
 * 			getBook(String isbn)
 * 
 * UPDATE(데이터변경, 데이터수정)
 * 		:도서 정보를 수정하기
 * 				한 도서의 각 속성(변수)에 저장된 값을 변경하는 것
 * 				updateBook()
 *  
 * DELETE(데이터삭제)
 * 		:도서 정보 삭제하기
 * 			한 도서의 데이터를 통째로 제거하는 것
 * 			deleteBook()
 */
public interface BookService {
	
	public void loadBook();
	public void printBoookList();
	
	public BookDto getBook(String isbn);
	public List<BookDto> getBookList();

	public void updateBook(BookDto bookDto);
	public void deleteBook(String isbn);

}
