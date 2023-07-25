package com.fuyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsmpApplication {
    public static void main(String[] args) {

     //关闭 热部署
      System.setProperty("spring.devtools.restart.enabled","false");
        SpringApplication.run(SsmpApplication.class, args);
    }

}
