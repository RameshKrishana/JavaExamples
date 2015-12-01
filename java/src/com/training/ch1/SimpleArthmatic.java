package com.training.ch1;

public class SimpleArthmatic {
	
	int firstNum;
	int secondNum;
	
	public SimpleArthmatic(){
		this.firstNum=0;
		this.secondNum=0;
	}
	
	public SimpleArthmatic(int first,int second){
		this.firstNum=first;
		this.secondNum=second;
	}
	
	public int Add(){
		return firstNum+secondNum;
	}
	
	public int subtract(){
		return (this.firstNum>this.secondNum)?this.firstNum-this.secondNum:this.secondNum-this.firstNum;
	}
	
	public int multiply(){
		return firstNum*secondNum;
	}
	
	public float divide(){
		return this.firstNum/this.secondNum;
	}

}
