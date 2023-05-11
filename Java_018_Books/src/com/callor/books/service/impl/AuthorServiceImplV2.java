package com.callor.books.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.books.models.AuthorDto;
import com.callor.books.service.AuthorService;

public class AuthorServiceImplV2 implements AuthorService{

	private List<AuthorDto> authorList;
	public AuthorServiceImplV2() {
		this.authorList = new ArrayList<>();
	}
	
	@Override
	public void loadAuthor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAuthorList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AuthorDto getAuthor(String code) {
		// TODO Auto-generated method stub
		if(authorList.isEmpty()) {
			this.loadAuthor();
		}
		
		for(AuthorDto dto : authorList) {
			if(dto.getAuCode().equals(code)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
		if(authorList.isEmpty()) {
			this.loadAuthor();
		}
		return authorList;
	}

}
