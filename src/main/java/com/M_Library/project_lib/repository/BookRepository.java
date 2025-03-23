package com.M_Library.project_lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.M_Library.project_lib.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,String> {
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthorContainingIgnoreCase(String author);
    @Query("SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(CONCAT('%', :query, '%')) OR LOWER(b.author) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Book> searchBooks(@Param("query") String query);


}



