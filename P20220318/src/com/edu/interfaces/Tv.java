package com.edu.interfaces;

public class Tv implements RemoteControl{
	public void powerOn() {
		System.out.println("Tv를 켭니다");
		
	}
	public void powerOff() {
		System.out.println("Tv를 끕니다");
	}
}
