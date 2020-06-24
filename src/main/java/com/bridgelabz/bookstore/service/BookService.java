package com.bridgelabz.bookstore.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.bridgelabz.bookstore.model.Book;
import com.bridgelabz.bookstore.model.dto.BookDto;
import com.bridgelabz.bookstore.response.Response;

public interface BookService {

	public List<Book> findBookByAuthorNameAndTile(String text);

	public List<Book> findAllBook();

	public void addBook(BookDto request, Long userId);

	public List<Book> sortBookByAsc();

	public List<Book> sortBookByDesc();
	
	
	
	
	
	
	
	
	
	

}
