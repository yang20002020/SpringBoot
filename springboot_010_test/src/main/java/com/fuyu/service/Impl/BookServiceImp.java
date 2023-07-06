package com.fuyu.service.Impl;
import com.fuyu.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImp implements BookService {
    @Override
    public void save() {
        System.out.println("book service is  running .....");
    }
}
