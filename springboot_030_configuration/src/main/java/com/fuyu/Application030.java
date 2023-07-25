package com.fuyu;
import com.fuyu.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application030 {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application030.class, args);
        ServerConfig bean = ctx.getBean(ServerConfig.class);
        System.out.println(bean);
    }

}
