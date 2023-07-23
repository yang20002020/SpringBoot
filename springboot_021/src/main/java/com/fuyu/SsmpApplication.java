package com.fuyu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsmpApplication {
    public static void main(String[] args) {
        args[0]="--server.port=8087";

        SpringApplication.run(SsmpApplication.class, args);
    }
}
