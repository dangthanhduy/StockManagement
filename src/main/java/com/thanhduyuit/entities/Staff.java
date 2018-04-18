package com.thanhduyuit.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Staffs")
public class Staff {

	// *** CLASS VARIABLE ****//

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String fullName;

	private String birthday;

	private String staffRole;

	private String staffGroup;

	private String description;

	private String phoneNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User account;

	@ManyToOne
	@JoinColumn(name = "stock_id")
	private Stock stock;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(String fullName, String birthday, String staffRole, String staffGroup, String description,
			String phoneNumber, User account, Stock stock) {
		super();
		this.fullName = fullName;
		this.birthday = birthday;
		this.staffRole = staffRole;
		this.staffGroup = staffGroup;
		this.description = description;
		this.account = account;
		this.stock = stock;
		this.phoneNumber = phoneNumber;
	}

	public User getAccount() {
		return account;
	}

	public void setAccount(User account) {
		this.account = account;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public String getStaffGroup() {
		return staffGroup;
	}

	public void setStaffGroup(String staffGroup) {
		this.staffGroup = staffGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
