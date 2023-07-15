package com.fuyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fuyu.dao.BookDao;
import com.fuyu.domain.Book;
import com.fuyu.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {
}
