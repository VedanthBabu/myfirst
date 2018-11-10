package com.example.userservice.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAddressDetailsContoller {
	@Autowired
	UserRestRepository repository;
	@Autowired
	AddressDetailsServiceProxy addressDetails;
	
	@GetMapping(value="/address/{id}")
	public AddressDetailsEntity getAddressDetailsByUser(@PathVariable(name="id") int id)
	{
		
		return addressDetails.getAddressDetails(id);
	}
	

}
