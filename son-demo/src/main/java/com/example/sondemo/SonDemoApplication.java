package com.example.sondemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sondemo.dao")
public class SonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonDemoApplication.class, args);
	}
}
