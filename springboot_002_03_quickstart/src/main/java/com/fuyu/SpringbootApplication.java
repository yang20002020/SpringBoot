package com.fuyu;
import com.fuyu.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootApplication.class, args);
        BookController bean = ctx.getBean(BookController.class);
        System.out.println("bean========>"+bean);
        User user = ctx.getBean(User.class);
        System.out.println("bean1=======>"+user);

    }

}
