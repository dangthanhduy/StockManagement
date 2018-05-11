package com.thanhduyuit.model;

public class UnitModelCreate {

	private String unitName;

	private String description;

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UnitModelCreate(String unitName, String description) {
		super();
		this.unitName = unitName;
		this.description = description;
	}

	public UnitModelCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
