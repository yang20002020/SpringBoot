package com.fuyu;


import com.fuyu.domain.Book;
import com.fuyu.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
public class ServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();

        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");
        bookService.save(book);
    }

}
