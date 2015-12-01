package com.training.ch1;

public class Student {
	
	String firstName;
	String lastName;
	String middleName;
	
	public Student(){
		this.firstName=null;
		this.middleName=null;
		this.lastName=null;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public void setMiddleName(String middleName){
		this.middleName=middleName;
	}
	
	public String getFullName(){
		return this.firstName+" "+((this.middleName==null)?" ":(this.middleName+" "))+this.lastName;
	}

}
