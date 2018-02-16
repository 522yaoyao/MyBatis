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
	public void testAdd() {
	    logger.info("��Ӳ���");	
	    sqlSession.insert("add",new Student(3,"haha",8));
    	sqlSession.commit();
   }
	
	@Test
	public void testUpdate(){
		logger.info("���²���");
	    int i=sqlSession.update("update",new Student(5,"����",11));
	    sqlSession.commit();
	  }
   
	@Test
	public void testDelete(){
		logger.info("ɾ������");
	    int i=sqlSession.delete("delete","����");
	    sqlSession.commit();
	 }
	
	@Test
	public void testGetById(){
		logger.info("��ѯ����");
	    Student student=sqlSession.selectOne("getById",8);
	    logger.info(student.getName());
	 }
	
	@Test
	public void testGetAllStudent(){
		logger.info("��ѯ����");
	    List<Student> studentList=sqlSession.selectList("getAllStudent");
	    for(Student stu: studentList)
	    logger.info(stu.getName());
	 }
	
	
}
