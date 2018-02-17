package junit;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java1234.model.Student;
import com.java1234.util.SqlSessionFactoryUtil;

public class JunitTest2 {
	
	private static Logger logger=Logger.getLogger(JunitTest2.class);
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
	public void testByAddress() {
	    logger.info("查询地址操作");	
	    Student stu=sqlSession.selectOne("getAById",1);
	    stu.toString();
    	//sqlSession.commit();
   }
	
	@Test
	public void testGetById(){
		logger.info("查询操作");
	    Student student=sqlSession.selectOne("getById",17);
	    logger.info(student.getName());
	 }
	
	
}
