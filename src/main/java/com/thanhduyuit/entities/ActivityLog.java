package com.thanhduyuit.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Log")
public class ActivityLog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Date date;

	private String actionType;

	private String goodName;

	private String goodCode;

	private double importPrice;

	private double exportPrice;

	private double quantity;

	private String providerName;

	private String CustomerName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public ActivityLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActivityLog(long id, Date date, String actionType, String goodName, String goodCode, double importPrice,
			double exportPrice, double quantity, String providerName, String customerName) {
		super();
		this.id = id;
		this.date = date;
		this.actionType = actionType;
		this.goodName = goodName;
		this.goodCode = goodCode;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.quantity = quantity;
		this.providerName = providerName;
		CustomerName = customerName;
	}
	
	public ActivityLog(Date date, String actionType, String goodName, String goodCode, double importPrice,
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
		CustomerName = customerName;
	}

}
