package com.fuyu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


//agrs 属性可以为当前测试用例添加临时的命令行参数
@SpringBootTest(args = {"--test.prop=testValue2"})
class test038 {

    @Value("${test.prop}")
    private  String msg;
    @Test
    void testProperties() {
        System.out.println(msg);
    }

}
