package com.thanhduyuit.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ReceiptDetail {

	// *** CLASS VARIABLE ****//

	private double quantity;

	private String goodID;

	private String Content;

	private double totalPrice;

	private String receiptID;

	// *** METHOD CONTRUCTOR AND GETTER- SETTER ****//

	public ReceiptDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiptDetail(double quantity, String goodID, String content, double totalPrice, String receiptID) {
		super();
		this.quantity = quantity;
		this.goodID = goodID;
		Content = content;
		this.totalPrice = totalPrice;
		this.receiptID = receiptID;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getGoodID() {
		return goodID;
	}

	public void setGoodID(String goodID) {
		this.goodID = goodID;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getReceiptID() {
		return receiptID;
	}

	public void setReceiptID(String receiptID) {
		this.receiptID = receiptID;
	}

}
