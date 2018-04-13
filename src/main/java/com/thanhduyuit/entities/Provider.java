package com.thanhduyuit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "Provider")
public class Provider {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String providerName;
	
	private String phoneNumber;
	
	private String address;
	
	private String vote;
	
	private String decription;
	

}
