

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

public  static String className="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public static String url="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=MyBatis";
	public static String user="sa";
	public static String password="";
	
	public static void main(String[] args){
		Connection con=null;
		 Statement stmt=null;
		//����������
		try {
			Class.forName(className);
			System.out.println("�������سɹ�");
		} catch (ClassNotFoundException e) {
		   e.printStackTrace();
		   System.out.println("��������ʧ��");
		}
		//�������ݿ�
		try {
			con=DriverManager.getConnection(url, user, password);
			 System.out.println("���ݿ����ӳɹ�");
			 String sql="insert into table_1 values(21,'hah',10,'sc')";
			  String sql1="insert into student values(244,'hah',0)";
			  stmt=con.createStatement();
			 int rs=stmt.executeUpdate(sql1);
			 System.out.println(rs);
			 } catch (SQLException e) {
			e.printStackTrace();
			 System.out.println("���ݿ�����ʧ��");
		}finally{//�ر����ݿ⣻
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}

