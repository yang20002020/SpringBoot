package com.fuyu.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fuyu.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private  BookService bookService;
    @Test
    void testGetById(){
        Book book = bookService.getById(4);
        System.out.println(book);
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试123");
        book.setName("java");
        book.setDescription("测试数据123");
        bookService.save(book);
    }

    @Test
    void testUpDate(){
        Book book = new Book();
        book.setId(23);
        book.setType("测试123abc");
        book.setName("java123");
        book.setDescription("测试数据123abc");
        bookService.update(book);
    }
    @Test
    void testDelete(){
        bookService.delete(25);
    }
    @Test
    void testGetAll(){
        List<Book> books = bookService.GetAll();
        System.out.println(books);
    }
    //分页
    @Test
    void testGetPage(){

        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

}
