package spring.controller.chap03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.service.chap03.ParamCommand;
import spring.service.chap03.item;

@Controller
@RequestMapping("/chap03/Paramters.do")
public class ParametersController {

	
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
			
		return "chap03/parameters";
	} 
	
	/*2.파라미터 이름과 매개변수 이름을 동일하게
	 * @RequestMapping(method=RequestMethod.POST)
	public String param(String itemNumber,String itemName){
		
		System.out.println(itemNumber);
		System.out.println(itemName);
		return "chap03/completion";
	}*/


	/*3. @RequestParam 사용
	@RequestMapping(method=RequestMethod.POST)
	public String param(@RequestParam("itemNumber") int itemNumber,String itemName){
		//RequestParam이 걸리면 타입 변환도 가능하다.
		
		System.out.println(itemNumber+3);
		System.out.println(itemName);
		return "chap03/completion";
		
	
	}*/
	
	
	
	/* 4. ㄱ) 매개변수에 커멘트 객체를 넣어주면 자동으로 커멘트 객체를 생성해주고
	 *    ㄴ) 커맨드 객체의 변수명과 파라미터의 값과 매칭시켜 저장시켜주고
	 *    ㄷ) 모델 객체로 넘겨준다.
	
	 * @RequestMapping(method=RequestMethod.POST)
	public String param(item item){
		//RequestParam이 걸리면 타입 변환도 가능하다.
		
		return "chap03/completion";
	}*/
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String param(@ModelAttribute("pa") ParamCommand command){
		//RequestParam이 걸리면 타입 변환도 가능하다.
		
		return "chap03/completion";
		
	}
	
	
	
	
	
	
	
	
}
