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
	 * ���Է���ǰ����
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		}

	/**
	 * ���Է��������
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}

	@Test
	public void testByAddress() {
	    logger.info("��ѯ��ַ����");	
	    Student stu=sqlSession.selectOne("getAById",1);
	    stu.toString();
    	//sqlSession.commit();
   }
	
	@Test
	public void testGetById(){
		logger.info("��ѯ����");
	    Student student=sqlSession.selectOne("getById",17);
	    logger.info(student.getName());
	 }
	
	
}
