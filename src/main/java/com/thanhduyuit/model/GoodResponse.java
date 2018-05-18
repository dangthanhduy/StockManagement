package com.thanhduyuit.model;

import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.Provider;

public class GoodResponse {

	private long id;

	private String name;

	private String code;

	private String type;

	private String unit;

	private String imagePath;

	private double quantity;

	private double importPrice;

	private double exportPrice;

	private GoodType goodType;

	private Provider provider;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
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

	public GoodType getGoodType() {
		return goodType;
	}

	public void setGoodType(GoodType goodType) {
		this.goodType = goodType;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public GoodResponse(long id, String name, String code, String type, String unit, String imagePath, double quantity,
			double importPrice, double exportPrice, GoodType goodType, Provider provider) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.type = type;
		this.unit = unit;
		this.imagePath = imagePath;
		this.quantity = quantity;
		this.importPrice = importPrice;
		this.exportPrice = exportPrice;
		this.goodType = goodType;
		this.provider = provider;
	}

	public GoodResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
