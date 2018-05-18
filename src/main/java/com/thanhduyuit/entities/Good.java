package com.thanhduyuit.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Good")
public class Good {

	// *** CLASS VARIABLE ****//

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private String code;

	private String type;

	private String unit;

	private String imagePath;

	private double quantity;

	private double importPrice;

	private double exportPrice;

	@ManyToOne
	@JoinColumn(name = "good_type_id")
	@JsonIgnore
	private GoodType goodType;

	@ManyToOne
	@JoinColumn(name = "provider_id")
	@JsonIgnore
	private Provider provider;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonIgnore
	private Customer customer;

	@ManyToMany(mappedBy = "listGoodOfStock")
	@JsonIgnore
	private Set<Stock> listStock;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Good(String name, String code, String type, String unit, String imagePath, double quantity,
			double importPrice, double exportPrice, GoodType goodType, Provider provider, Set<Stock> listStock) {
		super();
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
		this.listStock = listStock;
	}

	public Good(String name, String code, String type, String unit, String imagePath, double quantity,
			double importPrice, double exportPrice, GoodType goodType, Provider provider) {
		super();
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

	public Good(long id, String name, String code, String type, String unit, String imagePath, double quantity,
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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Set<Stock> getListStock() {
		return listStock;
	}

	public void setListStock(Set<Stock> listStock) {
		this.listStock = listStock;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
