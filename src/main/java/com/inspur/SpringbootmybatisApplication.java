package com.inspur;

import com.inspur.mybatisDemo.controller.MybatisDemoController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.inspur.mybatisDemo.mapper")
//@ComponentScan({"com.inspur.mybatisDemo.service"})
public class SpringbootmybatisApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootmybatisApplication.class, args);
		SpringApplication.run(SpringbootmybatisApplication.class, args);
	}
}
