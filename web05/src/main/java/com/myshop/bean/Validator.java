package com.myshop.bean;

import org.springframework.validation.Errors;

public interface Validator {
	public boolean supports(Class<?> clazz) throws Exception;
	public void validate(Object target, Errors errors) throws Exception;
}