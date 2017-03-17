package spring.controller.chap04;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class RestfulController {

	
	@RequestMapping("/userId/{userId}")
	public String form(@PathVariable String userId,Map<String, String> map){
		
		map.put("userId", userId);
		return "chap04/result";
	}
	
	
	
	
	
}
