package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("intro/viewName1");
		
		mav.addObject("greeting", "반갑습니다");
		
		
		
		return mav;
		
	}
	
	
	
	
	
}

