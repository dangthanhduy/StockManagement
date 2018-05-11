package com.thanhduyuit.model;

public class ProviderModelCreate {

	private String providerName;

	private String phoneNumber;

	private String description;

	private String vote;

	private String address;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ProviderModelCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProviderModelCreate(String providerName, String phoneNumber, String description, String vote,
			String address) {
		super();
		this.providerName = providerName;
		this.phoneNumber = phoneNumber;
		this.description = description;
		this.vote = vote;
		this.address = address;
	}

}
