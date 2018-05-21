package com.thanhduyuit.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ActivityLogModel {
	
	private String date;

	private String actionType;

	private String goodName;

	private String goodCode;

	private double importPrice;

	private double exportPrice;

	private double quantity;

	private String providerName;

	private String customerName;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getGoodCode() {
		return goodCode;
	}

	public void setGoodCode(String goodCode) {
		this.goodCode = goodCode;
	}

	public double getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(double importPrice) {
		this.importPrice = importPrice;
	}

	public double getExportPrice() {
		return exportPrice;
	}

	public void setExportPrice(double exportPrice) {
		this.exportPrice = exportPrice;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		customerName = customerName;
	}

	public ActivityLogModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ActivityLogModel(String date, String actionType, String goodName, String goodCode, double importPrice,
			double exportPrice, double quantity, String providerName, String customerName) {
		super();
		this.date = date;
		this.actionType = actionType;
		this.goodName = goodName;
		this.goodCode = goodCode;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.quantity = quantity;
		this.providerName = providerName;
		this.customerName = customerName;
	}


}
