package com.library.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.lib.entities.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
    
}
