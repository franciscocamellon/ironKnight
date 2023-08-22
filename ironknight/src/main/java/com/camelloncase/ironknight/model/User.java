package com.camelloncase.ironknight.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TableUsers")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String email;
	private String password;
	private String fullname;
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "idUser")
	private List<Dependent> dependents;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idAddress")
	private Address address;
	
	public User() {
	}

	public User(String username, String email, String password, String fullname) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
