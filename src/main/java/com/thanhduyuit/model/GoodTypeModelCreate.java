package com.thanhduyuit.model;

public class GoodTypeModelCreate {
	
	private String code;
	
	private String description;

	private String typeName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public GoodTypeModelCreate(String code, String description, String typeName) {
		super();
		this.code = code;
		this.description = description;
		this.typeName = typeName;
	}

	public GoodTypeModelCreate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
