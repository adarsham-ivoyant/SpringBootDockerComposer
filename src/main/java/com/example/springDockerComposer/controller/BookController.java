package com.example.springDockerComposer.controller;

import com.example.springDockerComposer.entity.Book;
import com.example.springDockerComposer.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @PostMapping("add")
    public Book addBook(@RequestBody Book book){
        return bookRepo.save(book);
    }

    @GetMapping("GetAll")
    public List<Book> getAll(){
        return bookRepo.findAll();
    }
}
