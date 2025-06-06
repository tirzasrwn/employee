package com.tirzasrwn.app.employee.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneCodeConstraintValidator implements ConstraintValidator<PhoneCode, String> {

	private String phonePrefix;

	@Override
	public void initialize(PhoneCode thePhoneCode) {
		phonePrefix = thePhoneCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidationContext) {
		if (theCode == null) {
			return false;
		}

		return theCode.startsWith(phonePrefix);
	}

}
