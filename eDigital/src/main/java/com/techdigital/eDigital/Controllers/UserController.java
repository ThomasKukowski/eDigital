
package com.techdigital.eDigital.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

import com.techdigital.eDigital.Validators.UserValidator;
import com.techdigital.Models.User.UserModel;
import com.techdigital.eDigital.Entities.*;
import com.techdigital.eDigital.TransferObjects.CreateUserTransferObject;
import com.techdigital.eDigital.TransferObjects.RegisterUserResponse;


@RestController
@RequestMapping(value = "/username/api/v1/", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
public class UserController {

	@Autowired
	private CreateUserTransferObject user;
	@Autowired
	private UserModel userModel;
	
	@PostMapping("authenticate")
	public CreateUserTransferObject authenticateUser(@RequestBody CreateUserTransferObject usr) {
		userModel.authenticate(usr);
		return usr;
	}
	
	@PostMapping("user")
	public RegisterUserResponse registerUser(@RequestBody CreateUserTransferObject usr) {
		RegisterUserResponse response = new RegisterUserResponse();
		
		//TODO Validator first
		
		//model
			//Persist to database
				//transform
		
		//return response
		
		return response;
	}
	
	@GetMapping("user")
	public CreateUserTransferObject getUser(CreateUserTransferObject u){
		return u;
	}
	
//	@GetMapping("")
	//Returning is List is supported with JSON response only
	//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
//	public List<User> getAllEmployees() {
//		return;
//	}


}
