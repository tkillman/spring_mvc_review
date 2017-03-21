package spring.controller.chap06;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.service.chap06.MemberDto;
import spring.validator.chap06.MemberInfoValidator;

@Controller
@RequestMapping("/chap06/loginForm.do")
public class LoginController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String form(){
		return "chap06/loginForm";
	}
	
	@ModelAttribute
	public MemberDto formBacking() {
		return new MemberDto();
	}

	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String loginCheck(@Valid MemberDto memberDto,BindingResult result){
		
		//지역 에러
		if(result.hasErrors()){
			return "chap06/loginForm";
		}
		
		//글로벌 에러
		if(!memberDto.getMemberId().equals(memberDto.getPassword())){
			result.reject("global", new Object[]{memberDto.getMemberId()}, "못찾겠다.");
			
			return "chap06/loginForm";
			
		}
		System.out.println("dd");
		return "redirect:/index.jsp";
	}
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		//validator 구현 객체만 받을 수 있다.
		binder.setValidator(new MemberInfoValidator());
		
	}

	
}
