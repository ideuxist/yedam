package com.edu.except.interfaces;

public class MainExe {
	public static void main(String[] args) {
		// 리모콘 -> Tv, Radio, 냉장고
		RemoteControl rm =new Tv();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Refrigarator();
		rm.powerOn();
		rm.powerOff();
	}

}
