package com.fuyu.service.impl;

import com.fuyu.dao.BookDao;
import com.fuyu.domain.Book;
import com.fuyu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book)>0;
    }
}
