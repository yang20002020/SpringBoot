package com.fuyu;
import com.fuyu.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot010TestApplicationTests {
    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        bookService.save();
    }

}
