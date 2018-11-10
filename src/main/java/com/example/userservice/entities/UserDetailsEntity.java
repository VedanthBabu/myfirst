package com.example.userservice.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetailsEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy="userDetailsEntity")
	private Set<AddressDetailsEntity> addressDetailsEntity= new HashSet<>();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<AddressDetailsEntity> getAddressDetailsEntity() {
		return addressDetailsEntity;
	}
	public void setAddressDetailsEntity(Set<AddressDetailsEntity> addressDetailsEntity) {
		this.addressDetailsEntity = addressDetailsEntity;
	}	
	
	

}
