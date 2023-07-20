package com.jspider.student_curd_with_prepared.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jspider.student_curd_with_prepared.dao.StudentDao;
import com.jspider.student_curd_with_prepared.dto.Student;

public class StudentService {
	
	StudentDao studentDao =new StudentDao();
	
	/*
	 * InsertMethod for student
	 */
	
	public Student saveStudentServices(Student student) {
		
		if(student.getStudentId()<=9999) {
			Student student2=studentDao.saveStudent(student);
			System.out.println("from method end");
			return student2;
		}else {
			System.err.println("Please pass your id with 4 digits or lessthan it...");
		}
		return null;
	}
	
	/*
	 * update student data methods
	 */
	
	public int updateStudentNameService(int studentid ,String studentName) {
		
		return studentDao.updateStudentName(studentid, studentName);
		
	}
	

}
