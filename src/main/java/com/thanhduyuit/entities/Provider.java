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

	// *** CLASS VARIABLE ****//

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

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Provider(String providerName, String phoneNumber, String address, String vote, String decription,
			Set<Good> listGoods) {
		super();
		this.providerName = providerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.vote = vote;
		this.decription = decription;
		this.listGoods = listGoods;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public Set<Good> getListGoods() {
		return listGoods;
	}

	public void setListGoods(Set<Good> listGoods) {
		this.listGoods = listGoods;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Provider(String providerName, String phoneNumber, String address, String vote, String decription) {
		super();
		this.providerName = providerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.vote = vote;
		this.decription = decription;
	}
	

}
