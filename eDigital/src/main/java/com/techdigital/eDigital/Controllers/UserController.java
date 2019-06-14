
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

import com.techdigital.Models.*;
import com.techdigital.Models.User.UserModel;
import com.techdigital.eDigital.Entities.*;
import com.techdigital.eDigital.TransferObjects.User;


@RestController
@RequestMapping(value = "/username/api/v1/", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
public class UserController {

	@Autowired
	private User user;
	@Autowired
	private UserModel userModel;
	
	@PostMapping("authenticate")
	public User authenticateUser(@RequestBody User usr) {
		userModel.authenticate(usr);
		return usr;
	}
	
	@PostMapping("user")
	public User registerUser(@RequestBody User usr) {
		//TODO Validator first
		
		//Transform into entity
		
		//Persist to database
		
		//return response
		
		return usr;
	}
	
	@GetMapping("user")
	public User getUser(User u){
		return u;
	}
	
//	@GetMapping("")
	//Returning is List is supported with JSON response only
	//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
//	public List<User> getAllEmployees() {
//		return;
//	}


}
