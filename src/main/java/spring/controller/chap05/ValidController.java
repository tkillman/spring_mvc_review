package spring.controller.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.service.chap05.MemberDto;
import spring.validator.MemberInfoValidator;

@Controller
@RequestMapping("/chap05/createForm.do")
public class ValidController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String form(){
		
		return "chap05/createForm";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String completion(MemberDto memberDto, BindingResult result){
		
		new MemberInfoValidator().validate(memberDto, result);
		
		if(result.hasErrors()){
			
			return "chap05/createForm";
		}
		
		
		return "chap05/completion";
	}
	
	
	
	
}
