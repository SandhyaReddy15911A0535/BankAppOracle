package com.cg.bankapp.model;

public class Customer_details {

	private int pancard_no,adhar_no,mobile_no,from_acc_no,to_acc_no,amount_transfered;
	private String first_name,last_name,email_id,password,adress;
	public int getPancard_no() {
		return pancard_no;
	}
	public void setPancard_no(int pancard_no) {
		this.pancard_no = pancard_no;
	}
	public int getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(int adhar_no) {
		this.adhar_no = adhar_no;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public int getFrom_acc_no() {
		return from_acc_no;
	}
	public void setFrom_acc_no(int from_acc_no) {
		this.from_acc_no = from_acc_no;
	}
	public int getTo_acc_no() {
		return to_acc_no;
	}
	public void setTo_acc_no(int to_acc_no) {
		this.to_acc_no = to_acc_no;
	}
	public int getAmount_transfered() {
		return amount_transfered;
	}
	public void setAmount_transfered(int amount_transfered) {
		this.amount_transfered = amount_transfered;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
