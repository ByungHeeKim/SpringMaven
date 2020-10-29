package com.hello.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hello.web.vo.HelloVO;

@Controller 
public class HelloController {
	
	
//	@RequestMapping("/hello")
//	public String viewHelloPage() {
//		return "hello";
//	}
	
	@RequestMapping("/list")
	public ModelAndView viewList() {
		final List<HelloVO> helloList = new ArrayList<HelloVO>();
		final ModelAndView view = new ModelAndView();
		HelloVO hello = null;
		
		for(int i=0; i<100; i++) {
			hello = new HelloVO();
			hello.setSubject("Hello");
			hello.setMsg("World");
			hello.setPriority(i+1);
			helloList.add(hello);
		}
		view.setViewName("list");
		view.addObject("HelloList", helloList);
		
		return view;
	}
}