package com.fuyu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests_037 {

    @Value("${dataSource.password}")
    private String password;
    @Value("${dataSource.psw}")
    private  String psw;

    @Test
    void contextLoads() {
        System.out.println(password);
        System.out.println(psw);
    }

}
