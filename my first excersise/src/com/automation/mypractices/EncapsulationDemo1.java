package com.automation.mypractices;
 class Accounts
 {
	private long acc_no;
	private String name;
	private String gmail;
	private float amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
 }

public class EncapsulationDemo1 {

	public static void main(String[] args) {
		Accounts acc = new Accounts();
		acc.setAcc_no(6544118783L);
		acc.setName("swathi");
		acc.setGmail("swathiguttikond1997@gmail.com");
		acc.setAmount(599999);
		System.out.println(acc.getName());
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getGmail());
		System.out.println(acc.getAmount());
		

	}

}
