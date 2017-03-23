package spring.controller.chap09;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.command.chap09.Code;
import spring.command.chap09.LoginCommand;
import spring.validator.chap09.validator;

@Controller
@RequestMapping("/login/login.do")
public class MemberController {

	@ModelAttribute("loginCommand")
	public LoginCommand commandReturn() {
		
		return new LoginCommand();
	}

	@ModelAttribute("loginTypes")
	public List<String> loginType() {
		
		List<String> loginType= new ArrayList<>();
		
		loginType.add("일반회원");
		loginType.add("기업회원");
		loginType.add("헤드헌터");
		
		return loginType; 
	}
	
	@ModelAttribute("jobCodes")
	public List<Code> jobCodesReturn() {
		
		List<Code> jobCodes= new ArrayList<>();
		
		jobCodes.add(new Code("1","개발자"));
		jobCodes.add(new Code("2","게이머"));
		jobCodes.add(new Code("3","사장님"));
		
		return jobCodes;
		
	}
	
	@ModelAttribute("favoriteOsNames")
	public String[] osNamesReturn() {
		String[] favoriteOsNames = {"윈도우xp","맥"};
		
		return favoriteOsNames;
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		
		
		
		return "chap09/loginForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String logic(LoginCommand loginCommand,BindingResult result) {
		
		new validator().validate(loginCommand, result);
		
		if(result.hasErrors()){
			return "chap09/loginForm";
		}
		
		if(!loginCommand.getMemberId().equals("test")){
			result.reject("wrong", new Object[]{loginCommand.getMemberId()}, "못찾겠다");
			return "chap09/loginForm";
		}
		
		
		
		return "login/completion";

	}

}
