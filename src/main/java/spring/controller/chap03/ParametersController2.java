package spring.controller.chap03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.service.chap03.ParamCommand;
import spring.service.chap03.item;

@Controller
@RequestMapping("/chap03/Paramters2.do")
public class ParametersController2 {

	
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
			
		return "chap03/parameters2";
	} 
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String param(@ModelAttribute("pa") ParamCommand command){
		//RequestParam이 걸리면 타입 변환도 가능하다.
		
		return "chap03/completion2";
		
	}
	
	
	
	
	
	
	
	
}
