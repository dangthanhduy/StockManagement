package com.thanhduyuit.model;

public class GoodModelExport {
	private String code;

	private double exportPrice;

	private double quantity;

	private String customerName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public GoodModelExport(String code, double exportPrice, double quantity, String customerName) {
		super();
		this.code = code;
		this.exportPrice = exportPrice;
		this.quantity = quantity;
		this.customerName = customerName;
	}

	public GoodModelExport() {
		super();
		// TODO Auto-generated constructor stub
	}

}
