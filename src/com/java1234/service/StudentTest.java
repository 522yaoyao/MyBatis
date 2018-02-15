
package com.java1234.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.java1234.mappers.StudentMapper;
import com.java1234.model.Student;
import com.java1234.util.SqlSessionFactoryUtil;

public class StudentTest {

  	private static Logger logger=Logger.getLogger(StudentTest.class);
	
	public static void main(String[] args) {
		SqlSession sqlSession=SqlSessionFactoryUtil.openSession();
		logger.info("更新操作");
	    int i=sqlSession.update("update",new Student(5,"张三",11));
	    sqlSession.commit();
	    System.out.println(i+"dddd");
	}
}
