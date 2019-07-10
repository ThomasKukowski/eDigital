package com.techdigital.eDigital.Transformers;

import com.techdigital.eDigital.Entities.AddressEntity;
import com.techdigital.eDigital.Entities.UserEntity;
import com.techdigital.eDigital.TransferObjects.CreateUserTransferObject;

public class UserTransformer implements Transformer <UserEntity, CreateUserTransferObject> {
	
	@Override
	public UserEntity transform(CreateUserTransferObject user)
	{
		//Produce userEntity which encapsulate the addressEntity 
		UserEntity userEntity = new UserEntity();
		AddressEntity addressEntity = new AddressEntity();
		
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
		
		// private int addressId;
		// private String line1;
		addressEntity.setLine1(user.getLine1());
		// private String line2;
		addressEntity.setLine2(user.getLine2());
		// private String city;
		addressEntity.setCity(user.getCity());
		// private String state;
		addressEntity.setState(user.getState());
		// private int zipcode;
		addressEntity.setZipcode(user.getZipcode());
		
		userEntity.setAddress(addressEntity);
		
		
		
		return userEntity;
	}

	
}
