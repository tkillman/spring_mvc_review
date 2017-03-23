package spring.validator.chap09;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.command.chap09.LoginCommand;



public class validator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		return LoginCommand.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "memberId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "password", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "address.address1", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "address.address2", "required");
		
	}

	
	
	
}
