package spring.controller.chap01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("chap01/viewName1");
		mav.addObject("greeting", "oject 헬로우");
		
		
		return mav;
	}
	
	
	
	
	
}

