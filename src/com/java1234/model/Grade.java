package com.java1234.model;

import java.util.List;

public class Grade {
	
	private int id;
	private String gradeName;
	private List<Student> students;//通过年级查询学生
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + ", students=" + students.size() + "]";
	}
   
	
}
