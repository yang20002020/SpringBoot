package com.fuyu;
import com.fuyu.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


@SpringBootTest
@Import(MsgConfig.class)
class test039 {

    @Autowired
    private  String msg;

    @Test
    void testConfiguration() {
        System.out.println(msg);
    }

}
