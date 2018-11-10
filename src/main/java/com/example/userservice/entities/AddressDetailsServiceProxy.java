package com.example.userservice.entities;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="address-details-service")
@RibbonClient(name="address-details-service")
public interface AddressDetailsServiceProxy {
	
	@GetMapping("/address/{id}")
	public AddressDetailsEntity getAddressDetails(@PathVariable("id")int id);
	

}
