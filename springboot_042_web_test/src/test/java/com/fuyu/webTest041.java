package com.fuyu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;


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

    @Test
    void testStatus(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books1");
        ResultActions actions = mvc.perform(builder);

        //设定预期值 与真实值进行比较，成功测试通过，失败测试失败
        //定义执行状态匹配器
        StatusResultMatchers status = MockMvcResultMatchers.status();
        //定义预期执行状态，预计本次调用是成功的，状态200
        ResultMatcher ok = status.isOk();
        //使用本次真实执行结果与预期结果进行对比
        //添加预计值ok到本次调用过程中进行匹配
        actions.andExpect(ok);
    }

    @Test
    void testBody(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        //设定预期值 与真实值进行比较，成功测试通过，失败测试失败
        //定义执行状态匹配器
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //定义预期执行结果 springboot1
        ResultMatcher resultMatcher = content.string("springboot1");
        //使用本次真实执行结果与预期结果进行对比
        actions.andExpect(resultMatcher);
    }

    @Test
    void testJson(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(builder);

        //设定预期值 与真实值进行比较，成功测试通过，失败测试失败
        //定义执行状态匹配器
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //定义预期执行结果 {"id":1,"name":"springboot","type":"springboot","description":"springboot"}
        ResultMatcher resultMatcher = content.json("{\"id\":1,\"name\":\"springboot2\",\"type\":\"springboot\",\"description\":\"springboot\"}");
        //使用本次真实执行结果与预期结果进行对比
        actions.andExpect(resultMatcher);
    }

}
