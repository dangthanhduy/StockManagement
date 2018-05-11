package com.thanhduyuit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UnitType")
public class Unit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String unit;

	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Unit(String unit, String description) {
		super();
		this.unit = unit;
		this.description = description;
	}

	public Unit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
