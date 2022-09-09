package com.infinidium.oracle.admin.transaction.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@SequenceGenerator(name="TRANSACTION_SEQ", sequenceName = "TRANSACTION_SEQ", initialValue = 1, allocationSize = 1)
@Table(name="TRANSACTION")
@Entity
@Data
public class Transaction {
	@Column(name="TRANSACTION_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_SEQ")
	private Integer transactionID;
	
	@Column(name="PRODUCT_ID", nullable=false)
	private Integer productID;
	
	@Column(name="USER_ID", nullable=false)
	private Integer userID;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TRANSACTION_TIME")
	private Date transactionTime;

	public Integer getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

}
