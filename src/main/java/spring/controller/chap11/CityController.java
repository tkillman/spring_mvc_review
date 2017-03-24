package spring.controller.chap11;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import net.sf.json.JSONObject;
import spring.service.chap11.SidoService;
@Controller
public class CityController {

	@Autowired
	SidoService service;
	
	
	public void setService(SidoService service) {
		this.service = service;
	}

	@RequestMapping(value= "/chap11/city.do", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String form(HttpServletResponse resp){
		resp.setContentType("text/html;charset=UTF-8");
		return "chap11/city";
	}
	
	@RequestMapping(value= "/chap11/sidoList.do", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String sidoList(HttpServletResponse resp){
		System.out.println("sidoList()");
		resp.setContentType("text/html;charset=UTF-8");
		JSONObject jso = new JSONObject();
		List<String> sidoList = service.sidoList();
		jso.put("data", sidoList);
		
		return jso.toString();
	}
	
	
}
