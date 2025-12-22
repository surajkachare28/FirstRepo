package com.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Student;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
	Student stu=ap.getBean(Student.class);
	System.out.println(stu);
}
}
