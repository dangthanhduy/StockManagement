package com.thanhduyuit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
