package com.thanhduyuit.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;



@Entity
@Table(name = "stock")
public class Stock {

	// *** CLASS VARIABLE ****//

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private String address;

	private String status;

	@OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
	private Set<Staff> listStaff;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Good_Stock", joinColumns = @JoinColumn(name = " stockID", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "goodID", referencedColumnName = "id"))
	private Set<Good> listGoodOfStock;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(String name, String address, String status, Set<Staff> listStaff, Set<Good> listGoodOfStock) {
		super();
		this.name = name;
		this.address = address;
		this.status = status;
		this.listStaff = listStaff;
		this.listGoodOfStock = listGoodOfStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Staff> getListStaff() {
		return listStaff;
	}

	public void setListStaff(Set<Staff> listStaff) {
		this.listStaff = listStaff;
	}

	public Set<Good> getListGoodOfStock() {
		return listGoodOfStock;
	}

	public void setListGoodOfStock(Set<Good> listGoodOfStock) {
		this.listGoodOfStock = listGoodOfStock;
	}

}
