package com.nexturn.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexturn.library.entity.Book;
import com.nexturn.library.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService service;

	@PostMapping
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		String str = service.addBook(book);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<String> updateBook(@RequestBody Book book) {
		String str = service.updateBook(book);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable String bookId) {
		String str = service.removeBook(bookId);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Book>> findAllBooks() {
		List<Book> bookList = service.findAllBooks();
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
	}

	@GetMapping("/byid/{bookId}")
	public ResponseEntity<Book> findBookById(@PathVariable String bookId) {
		Book bk = service.findBookById(bookId);
		return new ResponseEntity<Book>(bk, HttpStatus.OK);
	}

	@GetMapping("/bytitle/{title}")
	public ResponseEntity<List<Book>> findBookByTitle(@PathVariable String title) {
		List<Book> bk = service.findByTitle(title);
		return new ResponseEntity<List<Book>>(bk, HttpStatus.OK);
	}
	@GetMapping("/bytitleContaining/{title}")
	public ResponseEntity<List<Book>> findBookByTitleContainingIgnoreCase(@PathVariable String title) {
		List<Book> bk = service.findByTitleContaining(title);
		return new ResponseEntity<List<Book>>(bk, HttpStatus.OK);
	}
	@GetMapping("/byPrice/{price}")
	public ResponseEntity<List<Book>> findBookByPrice(@PathVariable double price) {
		List<Book> bk = service.findByPrice(price);
		return new ResponseEntity<List<Book>>(bk, HttpStatus.OK);
	}

}
