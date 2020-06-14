package com.cg.AccountMS.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class AccountEntity {
	@Id
	@Column(name="accountno")
	long accountNo;
	@Column(name="branchid")
	long branchId;
	@Column(name="accounttype")
	String accountType;
	@Column(name="aadhaar")
	String aadhaar ;
	@Column(name="pan")
	String pan;
	@Column(name="balance")
	String balance;
	@Column(name="status")
	String status;
	@Column(name="customername")
	String customerName;
	@Column(name="address")
	String address;
	@Column(name="mobilenumber")
	long mobileNumber;
	@Column(name="dob")
	Date dob;
	@Column(name="gender")
	String gender;
	
	
	
	public AccountEntity(long accountNo, long branchId, String accountType, String aadhaar, String pan, String balance,
			String status, String customerName, String address, long mobileNumber, Date dob, String gender) {
		super();
		this.accountNo = accountNo;
		this.branchId = branchId;
		this.accountType = accountType;
		this.aadhaar = aadhaar;
		this.pan = pan;
		this.balance = balance;
		this.status = status;
		this.customerName = customerName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.gender = gender;
	}
	
	public AccountEntity() {
		
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getBranchId() {
		return branchId;
	}
	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDate() {
		return dob;
	}
	public void setDate(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
