package spring.controller.chap02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.command.chap02.Dto;

@Controller
@RequestMapping("/chap02/newArticle.getpost")
public class NewArticleController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String form(){
	
		return "chap02/NewArticleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("dto") Dto dto){
		
		
		return "chap02/NewArticleSubmit";
	}
	
	
}
