package com.java1234.model;

public class Address {
	
	private int id;
	private String sheng;
	private String shi;
	private String qu;


//构造有参的构造方法会报错
//	public Address(int id, String sheng, String shi, String qu) {
//		super();
//		this.id = id;
//		this.sheng = sheng;
//		this.shi = shi;
//		this.qu = qu;
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getQu() {
		return qu;
	}
	public void setQu(String qu) {
		this.qu = qu;
	}
  
	@Override
	public String toString() {
		return "Address [id=" + id + ", sheng=" + sheng + ", shi=" + shi + ", qu=" + qu + "]";
	}
}
