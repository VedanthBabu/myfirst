package com.example.userservice.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authorities_Entity implements Serializable {

	@Id
	@Column(name="username")
	private String username;
	private String authority;
	@ManyToOne(cascade= CascadeType.ALL)
	private AppUserEntity appUserEntity;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public AppUserEntity getAppUserEntity() {
		return appUserEntity;
	}
	public void setAppUserEntity(AppUserEntity appUserEntity) {
		this.appUserEntity = appUserEntity;
	}
	
	
	
}
