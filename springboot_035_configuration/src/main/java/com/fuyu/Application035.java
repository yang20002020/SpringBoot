package com.fuyu;
import com.alibaba.druid.pool.DruidDataSource;
import com.fuyu.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application035 {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application035.class, args);
        ServerConfig bean = ctx.getBean(ServerConfig.class);
        System.out.println(bean);

    }

}
