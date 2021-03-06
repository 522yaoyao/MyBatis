package com.java1234.mappers;

import java.util.List;

import com.java1234.model.Student;

public interface StudentMapper {

	public int add(Student student);
	
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student getById(int id);
	
	public List<Student> getAllStudent();
	
	public Student getAById(int addressId);
	
	public Student findByGradeId(int id);
}
