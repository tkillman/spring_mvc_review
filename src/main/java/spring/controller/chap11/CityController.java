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

	@RequestMapping("/chap11/city.do")
	public String form(HttpServletResponse resp){
		resp.setContentType("text/html;charset=utf-8");
		return "chap11/city";
	}
	
	@RequestMapping(value= "/chap11/sidoList.do", method = RequestMethod.POST)
	@ResponseBody
	public String sidoList(HttpServletResponse resp){
		
		resp.setContentType("text/html;charset=utf-8");
		JSONObject jso = new JSONObject();
		List<String> sidoList = service.sidoList();
		jso.put("data", sidoList);
		
		return jso.toString();
	}
	
	
}
