package com.edu.interfaces;

public interface RemoteControl {
	//필드 불가
	//private String maxVolume;
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	//생성자 불가
	public void powerOn();
	public void powerOff();
}
