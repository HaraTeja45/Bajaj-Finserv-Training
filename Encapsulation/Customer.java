package com.finserv.Encapsulation;

public class Customer {
	
	private int Cid;
	private String Cname;
	private Account account;
	public Customer() //Composition
	{
		 account = new Account();
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		this.Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		this.Cname = cname;
	}
	public Account getaccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}
