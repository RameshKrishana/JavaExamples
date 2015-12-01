package com.training.runExamples;

import com.training.ch1.SimpleArthmatic;
import com.training.ch1.Student;

public class RunCh1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		stu.setFirstName("Sameer");
		stu.setMiddleName("Prasonn");
		stu.setLastName("Barath");
		
		System.out.println("Student Name : "+stu.getFullName());
		
		SimpleArthmatic arth=new SimpleArthmatic(10,15);
		System.out.println("Addition : "+arth.Add());
		System.out.println("Subtract : "+arth.subtract());
		System.out.println("Multiplication : "+arth.multiply());
		System.out.println("Division : "+arth.divide());

	}

}
