package com.java1234.model;

public class Student {

	private Integer id;
	private String name;
	private Integer age;
	private Address address;//根据外键获取对象
	
	public Address getAddress() {
            return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer id,String name, Integer age) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		System.out.println( "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address.toString() + "]");
		return null;
	}
	
}
