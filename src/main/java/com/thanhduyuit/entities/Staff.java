package com.thanhduyuit.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private User account;
	
	private String fullName;
	
	private Date birthdate;
	
	private String role;
	
	private String group;
	
	private String cmnd;
	

}
