package com.thanhduyuit.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String customerName;

	private String phoneNumber;

	private String address;

	private String customerVote;

	private String decription;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Good> listGoods;

}
