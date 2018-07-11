package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
@MapperScan("com.demo.mapper")
public class Demo1Application{

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
