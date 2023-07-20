package com.jspider.student_curd_with_prepared.dao;
import java.sql.Connection;

import com.jspider.student_curd_with_prepared.dto.Student;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jspider.student_curd_with_prepared.connection.StudentConnection;

public class StdentUpdateDao {
	/*
	 * insert method for student
	 */
	
	Connection connection=StudentConnection.getStudenConnection();
	public Student saveStudent(Student student){
		/*
		 *  code
		 */
		String updateQuery="update from student set studentname=? studentphone=? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		preparedStatement.setString(1,student.getStudentName());
		preparedStatement.setLong(2, student.getStudentPhone());
		int a=preparedStatement.executeUpdate();
		if(a==1) {
			System.out.println("......................Data is update..........................");
		}else {
			System.out.println("............Your data is not successfully update.................");
		}
		return student;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


}