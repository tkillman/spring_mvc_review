package spring.validator.chap06;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.command.chap06.MemberDto;

public class MemberInfoValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		
		return MemberDto.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {

		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"memberId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1,"password", "required");
	}
}
