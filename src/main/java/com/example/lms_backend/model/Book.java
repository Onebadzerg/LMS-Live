package com.example.lms_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")  // Ensure it maps to the correct MySQL table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_isbn")
    private String isbn;

    @Column(name = "book_title")
    private String title;

    @Column(name = "book_author")
    private String author;

    @Column(name = "book_status")
    private String status;  // Example: "Available", "Borrowed"

    @Column(name = "book_quantity")
    private int quantity;

    public Book() {}

    public Book(String isbn, String title, String author, String status, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.status = status;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
