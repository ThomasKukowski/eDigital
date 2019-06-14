package com.techdigital.eDigital.Transformers;

import com.techdigital.eDigital.Entities.UserEntity;
import com.techdigital.eDigital.TransferObjects.User;

public class UserTransformer implements Transformer <UserEntity, User> {
	
	@Override
	public UserEntity transform(User user)
	{
		UserEntity userEntity = new UserEntity();
		// private int userId auto-generated
		// private String userName
		userEntity.setUserName(user.getUserName());
		// private String password
		userEntity.setPassword(user.getPassword());
		// private String firstName
		userEntity.setFirstName(user.getFirstName());
		// private String lastName
		userEntity.setLastName(user.getLastName());
		// private String email
		userEntity.setEmail(user.getEmail());
		
		return userEntity;
	}

	
}
