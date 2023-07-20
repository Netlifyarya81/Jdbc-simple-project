package com.jspider.student_curd_with_prepared.connection;
import com.jspider.student_curd_with_prepared.dao.StudentDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Here connection using  
 */
public class StudentConnection {
	public static Connection getStudenConnection() {
		//Connection connection=null;
	   try {
	   //step--01 Load /Register Driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   //step--02  Create Connection
	   
	   String url="jdbc:mysql://localhost:3306/students";
	   String user="root";
	   String password="root";
	   Connection connection=DriverManager.getConnection(url, user, password);
	   
	   return connection;
	   
	   }catch(ClassNotFoundException |SQLException e) {
		   //TODO Auto-generated catch block
		   e.printStackTrace();
	   }
	   
	  return null;
   }
}
