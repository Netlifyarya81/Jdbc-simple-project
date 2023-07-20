package com.jspider.student_curd_with_prepared.dao;
import java.sql.Connection;

import com.jspider.student_curd_with_prepared.dto.Student;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jspider.student_curd_with_prepared.connection.StudentConnection;

public class StudentDao {
	/*
	 * insert method for student
	 */
	
	Connection connection=StudentConnection.getStudenConnection();
	public Student saveStudent(Student student){
		/*
		 *  code
		 */
		String insertQuery="insert into student values(?,?,?,?)";
		
		try {
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1,student.getStudentId());
		preparedStatement.setString(2, student.getStudentName());
		preparedStatement.setString(3, student.getStudentEmail());
		preparedStatement.setLong(4, student.getStudentPhone());
		preparedStatement.execute();
		System.out.println("..............Inserted successfully...............");
		return student;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}/*method insert ended */
	
	/*
	 * update student data methods
	 */
	
	public int updateStudentName(int studentid ,String studentName) {
		String updateStudentNameQuery="update student set studentname=? where studentid=?";
		
		try {
			PreparedStatement preparedStatement1=connection.prepareStatement(updateStudentNameQuery);
			
			preparedStatement1.setString(1,studentName);
			preparedStatement1.setInt(2,studentid);                       
			return preparedStatement1.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		return 0;
	}


}
