package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(101, "Java", 500));
        bookList.add(new Book(102, "Spring Boot", 700));
        bookList.add(new Book(103, "Os", 500));
        bookList.add(new Book(104, "Javascript", 400));
        bookList.add(new Book(105, "HTML", 200));
       
//        Map<Integer, Book> bookMap = bookList.stream()
//                .collect(Collectors.toMap(
//                        (book) -> book.getBookid(),
//                        (book) -> book
//                ));
        Map<Integer, Book> bookMap = new HashMap<Integer, Book>();

        bookList.forEach(book -> 
            bookMap.put(book.getBookId(), book)
        );
        System.out.println(bookMap);
	}

}
