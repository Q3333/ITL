package lab.spring.web.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return UserVO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		UserVO vo = (UserVO)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userid", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userpwd", "required");
	}
	
}
