package com.thanhduyuit.entities;

import java.util.Set;

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
@Table(name = "Provider")
public class Provider {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String providerName;
	
	private String phoneNumber;
	
	private String address;
	
	private String vote;
	
	private String decription;
	
	@OneToMany(mappedBy = "provider", cascade = CascadeType.ALL)
	private Set<Good> listGoods;
	

}
