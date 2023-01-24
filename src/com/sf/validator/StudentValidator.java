package com.sf.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sf.command.StudentCommand;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
		StudentCommand command = null;

		command = (StudentCommand) object;
		if (command.getId() <= 0) {
			errors.rejectValue("id", "id.invalid");
		}
		if (command.getName() == null || "".equals(command.getName())) {
			errors.rejectValue("name", "name.blank");
		}
	}

}
