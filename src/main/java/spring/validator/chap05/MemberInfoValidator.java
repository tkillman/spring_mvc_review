package spring.validator.chap05;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import spring.command.chap05.MemberDto;

public class MemberInfoValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		
		MemberDto dto = (MemberDto) arg0;
	
		if(dto.getMemberId() ==null || dto.getMemberId().trim().isEmpty()){
			System.out.println("saffs");
			arg1.rejectValue("memberId", "required");
		}
		
		if(dto.getPassword() ==null || dto.getPassword().trim().isEmpty()){
			System.out.println("saffsadf22");
			arg1.rejectValue("password", "required");
		}
		
	}
}
