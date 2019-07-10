package com.techdigital.eDigital.TransferObjects;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class RegisterUserResponse {
	
	String status;
	String firstName;
	String lastName;
	
	public ArrayList<String> errors;

}
