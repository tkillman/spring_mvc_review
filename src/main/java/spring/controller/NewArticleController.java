package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.service.BoardCommand;

@Controller
@RequestMapping("/article/newArticle.getpost")
public class NewArticleController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String form(){
	
		return "article/NewArticleForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("dto") BoardCommand command){
		
		return "article/NewArticleSubmit";
	}
	
	
}
