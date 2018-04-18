package com.thanhduyuit.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Receipt")
public class Receipt {

	// *** CLASS VARIABLE ****//

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String receiptCode;

	private String receiptType;

	private Date dateCreate;

	private double totalValue;

	private String staffIDCreate;

	private String stockID;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receipt(String receiptCode, String receiptType, Date dateCreate, double totalValue, String staffIDCreate,
			String stockID) {
		super();
		this.receiptCode = receiptCode;
		this.receiptType = receiptType;
		this.dateCreate = dateCreate;
		this.totalValue = totalValue;
		this.staffIDCreate = staffIDCreate;
		this.stockID = stockID;
	}

	public String getReceiptCode() {
		return receiptCode;
	}

	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public String getReceiptType() {
		return receiptType;
	}

	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public String getStaffIDCreate() {
		return staffIDCreate;
	}

	public void setStaffIDCreate(String staffIDCreate) {
		this.staffIDCreate = staffIDCreate;
	}

	public String getStockID() {
		return stockID;
	}

	public void setStockID(String stockID) {
		this.stockID = stockID;
	}

}
