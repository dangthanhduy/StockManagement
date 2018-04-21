package com.thanhduyuit.model;

public class ProviderModel {

	private Long id;
	private String providerName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public ProviderModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProviderModel(Long id, String providerName) {
		super();
		this.id = id;
		this.providerName = providerName;
	}

}
