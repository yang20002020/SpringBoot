package com.fuyu1;
import com.fuyu.Springboot011TestApplication;
import com.fuyu.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot011TestApplication.class)
class Springboot011TestApplicationTests1 {
    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        bookService.save();
    }

}
