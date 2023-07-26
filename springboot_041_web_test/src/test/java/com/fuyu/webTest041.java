package com.fuyu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//开启虚拟MVC调用 相当于一个开关
@AutoConfigureMockMvc
class webTest041 {

    @Test
    void testPort(){

    }

    @Test
    void testWeb(@Autowired MockMvc mvc) throws Exception {
       //创建虚拟请求，当前访问是: /books
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
          //执行请求
        ResultActions actions = mvc.perform(builder);
    }

}
