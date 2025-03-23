package com.M_Library.project_lib.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;

import java.util.Random;

@Entity
public class Book {

    @PrePersist
    public void ensureId() {
        if (this.bookId == null || this.bookId.isEmpty()) {
            this.bookId = generateUniqueId();
        }
    }


    @Id
    private String bookId;

    @NotBlank(message = "Kitap adı boş olamaz")
    private String title;

    @NotBlank(message = "Yazar adı boş olamaz")
    private String author;

    @NotNull(message = "Yayın ylı boş olamaz")
    @Min(value = 0,message = "Yayın yılı negatif olamaz")
    private int publicationYear;

    public Book() {
    }

    public Book(String title, String Author, int publicationYear) {
        this.bookId = generateUniqueId();
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    private String generateUniqueId(){
        Random random = new Random();
        int number = 100_000_000 + random.nextInt(900_000_000); // 100_000_000 okunabilirlik için alt çizgi
        return  String.valueOf(number);
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}


