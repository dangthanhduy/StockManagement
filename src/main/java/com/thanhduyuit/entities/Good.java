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


@Entity
@Table(name = "Good")
public class Good {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String code;
	
	private String type;
	
	private String unit;
	
	@ManyToOne
    @JoinColumn(name = "good_type_id")
	private GoodType goodType;
	
	@ManyToOne
    @JoinColumn(name = "provider_id")
	private Provider provider;
	
	private double pricePerUnit;
	
	@ManyToMany(mappedBy = "Receipt")
	private Set<Receipt> listReceipt;

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

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}


	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodType getGoodType() {
		return goodType;
	}

	public void setGoodType(GoodType goodType) {
		this.goodType = goodType;
	}

	public Good(String name, String code, String type, String unit, GoodType goodType, double pricePerUnit) {
		super();
		this.name = name;
		this.code = code;
		this.type = type;
		this.unit = unit;
		this.goodType = goodType;
		this.pricePerUnit = pricePerUnit;
	}
	
	
	
	
}
