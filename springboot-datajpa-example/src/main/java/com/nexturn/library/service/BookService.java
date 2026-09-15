package com.nexturn.library.service;

import java.util.List;

import com.nexturn.library.entity.Book;
import com.nexturn.library.exception.BookNotFoundException;

public interface BookService {
	public String addBook(Book book);
	String updateBook(Book book);
	String removeBook(String bookId);
	List<Book> findAllBooks();
	Book findBookById(String bookId) throws BookNotFoundException;
	List<Book> findByTitle(String title);
	List<Book> findByTitleContaining(String title);
	List<Book> findByPrice(double price);
	
}
