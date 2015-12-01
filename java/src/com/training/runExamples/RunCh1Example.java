package com.training.runExamples;

import com.training.ch1.Student;

public class RunCh1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		stu.setFirstName("Sameer");
		stu.setMiddleName("Prasonn");
		stu.setLastName("Barath");
		
		System.out.println("Student Name : "+stu.getFullName());

	}

}
