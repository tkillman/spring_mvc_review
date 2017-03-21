package spring.controller.chap08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptController {

	
	@RequestMapping("/chap08/interceptForm.do")
	public String form(){
		return "chap08/interceptForm";
	}
	
	@RequestMapping("/chap08/expire.do")
	public String expire(){
		return "chap08/expire";
	}
	
}
