package com.M_Library.project_lib.service;

import com.M_Library.project_lib.model.Book;
import com.M_Library.project_lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(String id){
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kitap bulunamadı : "+id));
    }

    public List<Book> getBooksByTitle(String title){
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }
    public List<Book> getBooksByAuthor(String author){
        return bookRepository.findByAuthorContainingIgnoreCase(author);
    }

    public void deleteBook(String id){
        if (!bookRepository.existsById(id)){
            throw new RuntimeException("Silinecek kitap bulunamadı: "+id);
        }
        bookRepository.deleteById(id);
    }

    public Book updateBook(String id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Güncellenecek kitap bulunamadı: " + id));

        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPublicationYear(updatedBook.getPublicationYear());

        return bookRepository.save(existingBook);
    }
    public List<Book> searchBooks(String query) {
        return bookRepository.searchBooks(query);
    }




}
