package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FinalQuizApplication {
//TODO GTB-知识点: * 很多基础知识点的使用都不正确。
//TODO GTB-完成度: * 按照给定的API，所有接口均无法进行正常调用
	public static void main(String[] args) {
		SpringApplication.run(FinalQuizApplication.class, args);
	}
}
