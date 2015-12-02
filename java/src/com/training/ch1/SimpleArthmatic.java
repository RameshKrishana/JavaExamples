package com.training.ch1;

public class SimpleArthmatic {
	
	int firstNum;
	int secondNum;
	
	public SimpleArthmatic(){
		this.firstNum=0;
		this.secondNum=0;
	}
	
	public SimpleArthmatic(int first,int second){
		firstNum=first;
		secondNum=second;
	}
	
	public int Add(){
		return firstNum+secondNum;
	}
	
	public int subtract(){
		return (firstNum>secondNum)?firstNum-secondNum:secondNum-firstNum;
	}
	
	public int multiply(){
		return firstNum*secondNum;
	}
	
	public float divide(){
		//return firstNum/secondNum;
		return (float)firstNum/(float)secondNum;
	}
	

}
