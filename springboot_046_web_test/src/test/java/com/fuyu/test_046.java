package com.fuyu;

import com.fuyu.domain.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test_046 {

    @Autowired
    private BookCase bookCase;

    @Test
    void testProperties(){

        System.out.println("----------------:"+bookCase);
    }


}
