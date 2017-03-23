package spring.controller.chap12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/login/login.do")
public class TilesController {

	
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(){
		return "loginForm";
	}
	
	
	
	
	
}
