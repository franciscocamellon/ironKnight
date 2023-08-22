package com.camelloncase.ironknight.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TableDependents")
public class Dependent {
	
	private Integer id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private Freemason user;

}
