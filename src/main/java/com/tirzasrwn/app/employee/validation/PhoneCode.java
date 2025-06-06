package com.tirzasrwn.app.employee.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = PhoneCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneCode {

	public String value() default "62";

	public String message() default "must start with 62";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

}
