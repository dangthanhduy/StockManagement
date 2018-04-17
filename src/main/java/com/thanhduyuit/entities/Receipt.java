package com.thanhduyuit.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Receipt")
public class Receipt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String receiptType;
	
	
	private Date dateCreate;
	
	private String code;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Good_receipt", joinColumns = @JoinColumn(name = " receipt_id2", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "good_id", referencedColumnName = "id"))
	private Set<Good> listGoods;
	
	private double totalValue;
	
	private String staffIDCreate;
	
	

}
