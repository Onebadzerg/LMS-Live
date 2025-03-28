package com.example.lms_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lms_backend.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}