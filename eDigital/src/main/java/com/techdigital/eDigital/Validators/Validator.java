package com.techdigital.eDigital.Validators;

@FunctionalInterface
public interface Validator <T, E> {
	
	T validate (E transferObject);

}
