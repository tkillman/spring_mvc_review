package spring.ExpireInterceptor;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{

	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(checkURI(request) && expiredate()){
			
			redirect(response);
			return false;
		}
		
		return true; 
	}
	//Adapter란 listener 구현 클래스로 빈 메소드를 가지고 있다.
	
	
	public boolean checkURI(HttpServletRequest request){
		
		if(request.getRequestURI().equals(request.getContextPath()+"/chap08/interceptForm.do")){
			
			return true;
		}
		
		return false;
	}
	
	public boolean expiredate(){
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2017, 1, 1);
		
		Date date = new Date();
		
		return date.after(calendar.getTime());
		
	}
	
	public void redirect(HttpServletResponse response) throws IOException{
		response.sendRedirect("expire.do");
	}
	
	
}
