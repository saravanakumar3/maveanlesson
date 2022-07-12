package com.chainsys.mavenlessons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
@RequestMapping("addUser")
public String user() {
	System.out.println("Hello");
	return "index.jsp"; // add jar file  of jasper for return html file 
}

}
