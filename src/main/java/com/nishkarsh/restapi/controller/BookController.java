package com.nishkarsh.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nishkarsh.restapi.model.Book;
import com.nishkarsh.restapi.repository.BookRepository;

import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

@Autowired
    BookRepository bookRepository;

// Get All Notes
    @GetMapping("/books")
    public List<Book> getAllNotes() {
        return bookRepository.findAll();
    }

// Create a new Note
    @PostMapping("/books/create")
    public Book createNote( @RequestBody Book book) {
        return bookRepository.save(book);
    }
 // Create a new Note
    @GetMapping("/testurl")
    public String getdata() {
        return "hey i am test url";
    }


}