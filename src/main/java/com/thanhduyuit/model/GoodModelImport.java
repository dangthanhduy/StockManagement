package com.thanhduyuit.model;

public class GoodModelImport {
	private String code;

	private double importPrice;

//	private double exportPrice;

	private double quantity;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(double importPrice) {
		this.importPrice = importPrice;
	}
//
//	public double getExportPrice() {
//		return exportPrice;
//	}

//	public void setExportPrice(double exportPrice) {
//		this.exportPrice = exportPrice;
//	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public GoodModelImport(String code, double importPrice, double quantity) {
		super();
		this.code = code;
		this.importPrice = importPrice;
//		this.exportPrice = exportPrice;
		this.quantity = quantity;
	}

	public GoodModelImport() {
		super();
		// TODO Auto-generated constructor stub
	}

}
