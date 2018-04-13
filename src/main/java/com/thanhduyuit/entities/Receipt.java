package com.thanhduyuit.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "Receipt")
public class Receipt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String receiptType;
	
	
	private Date dateCreate;
	
	private String code;
	
	private Set<Good> listGoods;
	
	private double totalValue;
	
	private Staff staffCreate;
	
	

}
