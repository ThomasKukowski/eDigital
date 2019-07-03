package com.techdigital.eDigital.Validators;

import java.util.ArrayList;

import com.techdigital.eDigital.TransferObjects.CreateUserTransferObject;
import com.techdigital.eDigital.Validators.Validator;

// return a string of responses 
public class UserValidator /*implements Validator<>*/ {
	
	private ArrayList<String> errorString = new ArrayList<String>();
	
	public ArrayList<String> validate(CreateUserTransferObject userTO){
		
		return errorString;
	}
}
