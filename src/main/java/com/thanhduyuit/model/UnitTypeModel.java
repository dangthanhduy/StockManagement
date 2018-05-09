package com.thanhduyuit.model;

public class UnitTypeModel {

	private Long id;

	private String unitName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public UnitTypeModel(Long id, String unitName) {
		super();
		this.id = id;
		this.unitName = unitName;
	}

	public UnitTypeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
