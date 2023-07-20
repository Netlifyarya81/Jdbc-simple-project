package com.jspider.student_curd_with_prepared.controller;

import java.util.Scanner;

import com.jspider.student_curd_with_prepared.dao.StudentDao;
import com.jspider.student_curd_with_prepared.dto.Student;
import com.jspider.student_curd_with_prepared.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = null;
		StudentService studentService = new StudentService();
		System.out.println("1.Insert  \n2.Upadte");
		System.out.println("enter your option....");
//		Student student=new Student(101,"vivek","vivek@gmail.com",854566232);
		int ch = scanner.nextInt();

		StudentDao studentDao = new StudentDao();

		switch (ch) {
		case 1: {
			      System.out.println("Enter student id");
			      int id = scanner.nextInt();
			      System.out.println("Enter student name");
		          String name = scanner.next();
			      System.out.println("Enter student email");
			      String email = scanner.next();
			      System.out.println("Enter student phone");
			      long phone = scanner.nextLong();
			      student = new Student(id, name, email, phone);
			      studentDao.saveStudent(student);
		       }
		      break;
		      
		      
		case 2: {
			 System.out.println("Enter student Id");
		      int id= scanner.nextInt();
		      System.out.println("Enter student name");
	          String name = scanner.next();
				int a=studentService.updateStudentNameService(id,name);
			if(a==1) {
				System.out.println(".....Data------Update.......");
			}else {
				System.out.println("Id not found please check once....");
			}
	       }
	      break;
		}

	}

}
