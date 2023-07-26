package com.fuyu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;


//properties  属性可以为当前测试用例添加临时的属性配置
@SpringBootTest(properties = {"test.prop=testValue1"},args = {"--test.prop=testValue2"})
class test038_1 {

    @Value("${test.prop}")
    private  String msg;
    @Test
    void testProperties() {
        System.out.println(msg);
    }

}
