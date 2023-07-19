package com.fuyu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fuyu.domain.Book;

import java.util.List;

public interface BookService {

   Boolean  save(Book book);
   Boolean update(Book book);
   Boolean delete(Integer id);
   Book getById(Integer id);
   List<Book> GetAll();
   IPage<Book> getPage(int currentPage,int pageSize);

}
