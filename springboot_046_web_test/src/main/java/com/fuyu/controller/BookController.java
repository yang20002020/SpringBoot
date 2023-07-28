package com.fuyu.controller;
import com.fuyu.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class BookController {

//    @GetMapping
//    public String getById(){
//        System.out.println("getbyId is running.....");
//        return "springboot";
//    }

    @GetMapping
    public Book getById(){
        Book book =new Book();
        book.setId(1);
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");
        return book;
    }

}
