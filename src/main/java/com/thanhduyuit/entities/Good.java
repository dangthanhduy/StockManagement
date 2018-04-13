package com.thanhduyuit.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Good {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String code;
	
	private GoodType type;
	
	private String unit;
	
	private double pricePerUnit;
	

}
