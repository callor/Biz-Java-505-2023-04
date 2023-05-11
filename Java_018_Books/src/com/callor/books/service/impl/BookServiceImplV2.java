package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.models.BookDto;
import com.callor.books.service.BookService;

public class BookServiceImplV2 implements BookService{

	protected List<BookDto> bookList;
	public BookServiceImplV2() {
		bookList = new ArrayList<>();
	}
	
	
	// 도서정보.txt 파일을 읽어와서
	// List<BookDto> type 리스트 데이터로 변환하는 method
	@Override
	public void loadBook() {

		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
			
			BookDto bDto = new BookDto();
			bDto.setbIsbn(book[ DataIndex.BOOK.ISBN ] );
			bDto.setbTitle( book[ DataIndex.BOOK.TITLE ] );
			bDto.setbPublisher( book[ DataIndex.BOOK.PUBLISHER ] );
			bDto.setbAuthor( book[ DataIndex.BOOK.AUTHOR ] );
			bDto.setbPublishDate( book[ DataIndex.BOOK.PDATE ] );
			bDto.setbPages( Integer.valueOf(book[ DataIndex.BOOK.PAGES ] ) );
			
			// "  가나다  " : 문자열 앞 뒤에 space 가 포함된 상태
			//    가나다   
			// "  1000 " : Integer.valueOf("  1000 ")
			//		=> NumberFormatException 발생
			// 이러한 상황에서 숫자 앞뒤에 붙어있는 space 를 제거해줘야 한다
			// 다른변수  = 문자열변수.trim()
			String strPrice = book[ DataIndex.BOOK.PRICE].trim();
			bDto.setbPrice( Integer.valueOf( strPrice ));
			bookList.add(bDto);
		}
		scan.close();
	}

	@Override
	public void printBoookList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		
	}

	
	
}
