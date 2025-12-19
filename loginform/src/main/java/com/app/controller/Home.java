package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import com.app.model.Student;


@Controller
public class Home {

	
		@RequestMapping("/")
		public String preLogin()
		{
			return "login";
		}
		
		@RequestMapping("/log")
		public String loginStudent(@RequestParam("uname") String uname, @RequestParam("pass") String pass, Model m )
		{
	
			
			m.addAttribute("uname", uname);
			m.addAttribute("pass", pass);
			
			return "logindata";
		}
		
		
//		@RequestMapping("/log/{uname}/{pass}")
//		public String loginStudent(@PathVariable("uname") String uname, @PathVariable("pass") String pass)
//		{
//			System.out.println("Username is: "+uname);
//			System.out.println("Password is: "+pass );
//			return "success";
//		}
		
		
		
		@RequestMapping("register")
		public String preRegister()
		{
			return "register";
		}
		
		@RequestMapping("reg")
		public String registerStudent(@ModelAttribute Student stu, Model m)
		{
			
		    m.addAttribute("stu", stu);
	        return "success";
		}
		
		
		@RequestMapping("show")
		public String displayData(ModelMap mm)
		{
			Student stu = new Student();
			stu.setRollno(1);
			stu.setName("aaa");
			stu.setMarks(100);
			stu.setUname("aaa@gmail.com");
			stu.setPass("pass@123");
			
			
			mm.put("num", 100);
			mm.put("cityname", "pune");
			mm.put("stu", stu);
			
			return "success";
		}
		
		


		
		
	}

	

