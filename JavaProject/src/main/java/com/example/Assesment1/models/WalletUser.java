package com.example.Assesment1.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class WalletUser {

	public WalletUser() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;
	// GUIN FIELDS
	private Float transactionAmt;
	private String sendingAmt;
	private String transactionType;
	private Date transactionDate;
	private String transferTo;
	public WalletUser(long userid, Float transactionAmt, String sendingAmt, String transactionType,
			Date transactionDate, String transferTo) {
		this.userid = userid;
		this.transactionAmt = transactionAmt;
		this.sendingAmt = sendingAmt;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.transferTo = transferTo;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public Float getTransactionAmt() {
		return transactionAmt;
	}
	public void setTransactionAmt(Float transactionAmt) {
		this.transactionAmt = transactionAmt;
	}
	public String getSendingAmt() {
		return sendingAmt;
	}
	public void setSendingAmt(String sendingAmt) {
		this.sendingAmt = sendingAmt;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransferTo() {
		return transferTo;
	}
	public void setTransferTo(String transferTo) {
		this.transferTo = transferTo;
	}
	
	

}
