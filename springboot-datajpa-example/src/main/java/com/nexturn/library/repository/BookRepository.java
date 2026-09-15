package com.nexturn.library.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nexturn.library.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,String> {
    List<Book> findByTitle(String title);
    List<Book> findByTitleContainingIgnoreCase(String title);
    @Query(value ="select b from Book b where b.price<?1")
    List<Book> searchBooksWithPrice(double price);
}
