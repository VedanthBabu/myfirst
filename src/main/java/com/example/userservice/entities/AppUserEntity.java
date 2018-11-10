package com.example.userservice.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="app_users")
public class AppUserEntity implements Serializable {

	@Id
	@Column(name="username",nullable=false)
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="enabled")
	private boolean enabled;
	@OneToMany(mappedBy="appUserEntity",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Authorities_Entity> authorities_Entities = new HashSet<>();
	
	
	public Set<Authorities_Entity> getAuthorities_Entities() {
		return authorities_Entities;
	}
	public void setAuthorities_Entities(Set<Authorities_Entity> authorities_Entities) {
		this.authorities_Entities = authorities_Entities;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
}
