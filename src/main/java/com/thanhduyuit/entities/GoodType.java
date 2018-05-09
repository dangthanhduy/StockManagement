package com.thanhduyuit.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GoodType")
public class GoodType {

	// *** CLASS VARIABLE ****//

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String typeName;

	private String code;

	private String decription;

	@OneToMany(mappedBy = "goodType", cascade = CascadeType.ALL)
	private Set<Good> listGoods;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public GoodType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodType(String typeName, String code, String decription, Set<Good> listGoods) {
		super();
		this.typeName = typeName;
		this.code = code;
		this.decription = decription;
		this.listGoods = listGoods;
	}

	public Set<Good> getListGoods() {
		return listGoods;
	}

	public void setListGoods(Set<Good> listGoods) {
		this.listGoods = listGoods;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public GoodType(String typeName, String code, String decription) {
		super();
		this.typeName = typeName;
		this.code = code;
		this.decription = decription;
	}
	

}
