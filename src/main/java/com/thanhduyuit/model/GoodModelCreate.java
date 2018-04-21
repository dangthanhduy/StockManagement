package com.thanhduyuit.model;

public class GoodModelCreate {

	private String name;

	private String code;

	private String type;

	private String unit;

	private String imagePath;

	private String providerID;

	public GoodModelCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodModelCreate(String name, String code, String type, String unit, String imagePath, String providerID) {
		super();
		this.name = name;
		this.code = code;
		this.type = type;
		this.unit = unit;
		this.imagePath = imagePath;
		this.providerID = providerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getProviderID() {
		return providerID;
	}

	public void setProviderID(String providerID) {
		this.providerID = providerID;
	}

}
