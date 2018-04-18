package com.thanhduyuit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

	// *** CLASS VARIABLE ****//
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String email;

	private String pasword;

	@NotNull
	private String name;

	@OneToOne(mappedBy = "account")
	private Staff staff;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String pasword, String name, Staff staff) {
		super();
		this.email = email;
		this.pasword = pasword;
		this.name = name;
		this.staff = staff;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}