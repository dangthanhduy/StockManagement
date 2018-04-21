package com.thanhduyuit.model;

public class GoodTypeModel {

	private Long id;
	private String goodTypeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return goodTypeName;
	}

	public void setName(String name) {
		this.goodTypeName = name;
	}

	public GoodTypeModel(Long id, String goodTypeName) {
		super();
		this.id = id;
		this.goodTypeName = goodTypeName;
	}

	public GoodTypeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
