package com.fuyu.dao;

import com.fuyu.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(2));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试123");
        book.setName("java");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpDate(){
        Book book = new Book();
        book.setId(23);
        book.setType("测试123abc");
        book.setName("java123");
        book.setDescription("测试数据123abc");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
       bookDao.deleteById(24);
    }
    @Test
    void testGetAll(){
        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }
}
