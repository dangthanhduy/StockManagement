package com.thanhduyuit.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GoodModelCreate {

	private long id;

	private String name;

	private String code;

	private String type;

	private String unit;

	private String imagePath;

	private String providerID;

	private String importPrice;

	private String exportPrice;

	private double quantity;

	public GoodModelCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodModelCreate(String name, String code, String type, String unit, String imagePath, String providerID,
			String importPrice, String exportPrice) {
		super();
		this.name = name;
		this.code = code;
		this.type = type;
		this.unit = unit;
		this.imagePath = imagePath;
		this.providerID = providerID;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
	}

	public GoodModelCreate(long id, String name, String code, String type, String unit, String imagePath,
			String providerID, String importPrice, String exportPrice, double quantity) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.type = type;
		this.unit = unit;
		this.imagePath = imagePath;
		this.providerID = providerID;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.quantity = quantity;
	}

	public String getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(String importPrice) {
		this.importPrice = importPrice;
	}

	public String getExportPrice() {
		return exportPrice;
	}

	public void setExportPrice(String exportPrice) {
		this.exportPrice = exportPrice;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
