package com.thanhduyuit.model;

import java.util.Date;

public class FilterModel {

	private String code;

	private String name;

	private Date fromDate;

	private Date toDate;

	private String type;

	public FilterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FilterModel(String code, String name, Date fromDate, Date toDate, String type) {
		super();
		this.code = code;
		this.name = name;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
