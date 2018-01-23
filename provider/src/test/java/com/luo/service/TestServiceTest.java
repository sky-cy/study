package com.luo.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
		applicationContext.start();
		System.out.println("提供者服务已注册成功");    
        try {  
            System.in.read();//让此程序一直跑，表示一直提供服务  
        } catch (IOException e) {         
            e.printStackTrace();  
        }    
	}
}
