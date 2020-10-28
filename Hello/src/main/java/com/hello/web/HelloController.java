package com.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HelloController {
	@RequestMapping("/hello")
	public String viewHelloList() {
		return "list";
	}
	
}