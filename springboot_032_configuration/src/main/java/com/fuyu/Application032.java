package com.fuyu;
import com.alibaba.druid.pool.DruidDataSource;
import com.fuyu.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application032 {



    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource1(){
        DruidDataSource ds = new DruidDataSource();

        return ds;
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application032.class, args);
        ServerConfig bean = ctx.getBean(ServerConfig.class);
        System.out.println(bean);
        DruidDataSource bean1 = ctx.getBean(DruidDataSource.class);
        System.out.println(bean1.getDriverClassName());

    }

}
