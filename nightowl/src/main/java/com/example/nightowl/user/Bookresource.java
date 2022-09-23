package com.example.nightowl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Bookresource {

    @Autowired
    private BookRepository bookRepository;


    @GetMapping("/books")
    public List<Books> getallbooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/books/{book_id}")
    public Optional<Books> getbook(@PathVariable String book_id) {
        return bookRepository.findById(book_id);
    }

    @GetMapping("/dashboard")
    public List<Books> topratedbooks() {
        return bookRepository.rating();
    }
    @GetMapping("/rating")
    public Collection<List> groupbyrating(){
        return bookRepository.groupbyrating();
    }

    @GetMapping("/groupbytype")
    public Collection<List> groupbytype(){
        return bookRepository.groupbytype();
    }




}


