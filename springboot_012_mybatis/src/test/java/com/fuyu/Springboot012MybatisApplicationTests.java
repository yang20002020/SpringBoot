package com.fuyu;

import com.fuyu.dao.BookDao;
import com.fuyu.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot012MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void getById() {
        Book book = bookDao.getById(2);
        System.out.println(book);
    }

}
