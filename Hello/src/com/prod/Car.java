package com.prod;

public class Car {
	// �𵨸�, ����ӵ�()���, �ְ��, ����()���, ����()���
	private String model;
	private int speed;
	private int maxSpeed;

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {

		if (this.speed + 10 > this.maxSpeed) {
			System.out.println("�ְ�ӵ��� �ʰ��� �� �����ϴ�");
			return;
		}
		System.out.println("10km �����մϴ�");
		this.speed += 10;

	}

	public void breakSpeed() {
		System.out.println("10km �����մϴ�");
		this.speed -= 10;

	}

	public int getSpeed() {
		return this.speed;
	}

}
