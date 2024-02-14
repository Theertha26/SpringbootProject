package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Product {
	@Id
	long pid;
	String pname;
	String ptxnno;
	String pdetails;
	boolean pstatus;
	public Product() {
		super();
	}
	public Product(long pid, String pname, String ptxnno, String pdetails, boolean pstatus) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptxnno = ptxnno;
		this.pdetails = pdetails;
		this.pstatus = pstatus;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtxnno() {
		return ptxnno;
	}
	public void setPtxnno(String ptxnno) {
		this.ptxnno = ptxnno;
	}
	public String getPdetails() {
		return pdetails;
	}
	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	public boolean isPstatus() {
		return pstatus;
	}
	public void setPstatus(boolean pstatus) {
		this.pstatus = pstatus;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptxnno=" + ptxnno + ", pdetails=" + pdetails
				+ ", pstatus=" + pstatus + "]";
	}
	
	

}
