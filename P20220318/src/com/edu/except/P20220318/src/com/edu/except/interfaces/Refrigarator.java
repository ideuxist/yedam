package com.edu.except.interfaces;

public class Refrigarator implements RemoteControl {
	public void on() {
		System.out.println("냉장고를 켭니다");
	}
	public void off() {
		System.out.println("냉장고를 끕니다");
	}
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
}
