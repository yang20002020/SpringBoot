package com.fuyu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fuyu.domain.Book;
import org.springframework.context.annotation.Bean;

//业务层接口

public interface IBookService  extends IService<Book> {

  boolean saveBook(Book book);

  IPage<Book> getPage(int currentPage,int pageSize);
}
