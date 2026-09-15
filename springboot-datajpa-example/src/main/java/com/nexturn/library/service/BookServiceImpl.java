package com.nexturn.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexturn.library.entity.Book;
import com.nexturn.library.exception.BookNotFoundException;
import com.nexturn.library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository repo;

	public String addBook(Book book) {
		Book bk = repo.save(book);
		String str = "book insered id= " + bk.getBookId();
		return str;
	}

	@Override
	public String updateBook(Book book) {
		repo.save(book);
		String str = "book details updated";
		return str;
	}

	@Override
	public String removeBook(String bookId) {
	    repo.deleteById(bookId);;
		return "book deleted";
	}

	@Override
	public List<Book> findAllBooks() {
		return repo.findAll();
	}

	@Override
	public Book findBookById(String bookId) {
		Optional<Book> book=repo.findById(bookId);
		if(book.isEmpty()) throw new BookNotFoundException();
		return book.get();
	}

	@Override
	public List<Book> findByTitle(String title) {
		List<Book> bookList=repo.findByTitle(title);
		return bookList;
	}

	@Override
	public List<Book> findByTitleContaining(String title) {
		List<Book> bookList=repo.findByTitleContainingIgnoreCase(title);
		return bookList;
	}

	@Override
	public List<Book> findByPrice(double price) {
		List<Book> bookList=repo.searchBooksWithPrice(price);
		return bookList;
	}
	

}
