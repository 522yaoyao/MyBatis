package junit;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java1234.model.Student;
import com.java1234.util.SqlSessionFactoryUtil;

public class JunitTest {
	
	private static Logger logger=Logger.getLogger(JunitTest.class);
	SqlSession sqlSession=null;

	/**
	 * 测试方法前调用
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		}

	/**
	 * 测试方法后调用
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testAdd() {
	    logger.info("添加操作");	
	    sqlSession.insert("add",new Student(3,"haha",8));
    	sqlSession.commit();
   }
	
	@Test
	public void testUpdate(){
		logger.info("更新操作");
	    int i=sqlSession.update("update",new Student(5,"张三",11));
	    sqlSession.commit();
	  }
   
	@Test
	public void testDelete(){
		logger.info("删除操作");
	    int i=sqlSession.delete("delete","王五");
	    sqlSession.commit();
	 }
	
	@Test
	public void testGetById(){
		logger.info("查询操作");
	    Student student=sqlSession.selectOne("getById",8);
	    logger.info(student.getName());
	 }
	
	@Test
	public void testGetAllStudent(){
		logger.info("查询操作");
	    List<Student> studentList=sqlSession.selectList("getAllStudent");
	    for(Student stu: studentList)
	    logger.info(stu.getName());
	 }
	
	
}
