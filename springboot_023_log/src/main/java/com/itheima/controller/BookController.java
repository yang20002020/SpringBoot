package com.itheima.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    private static final Logger Log= LoggerFactory.getLogger(BookController.class);


    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){

        System.out.println("springboot is running...");
        Log.debug("debug...");
        Log.info("info...");
        Log.warn("warn...");
        Log.error("error...");

        System.out.println("id ==> " + id);
        return "hello , spring boot!";
    }

}


