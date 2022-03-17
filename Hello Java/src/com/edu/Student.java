package com.edu;

public class Student {
	// �л���ȣ, �л��̸�, ��������, ��������, ��������
	private int studNo;
	private String StudName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;
	
	
	//������ : �ʵ��� ���� �ʱ�ȭ..
	public Student() {
		this.studNo = 1;
		this.StudName = "Nobody";
		this.korScore = 0;
		this.engScore = 0;
	}
	public Student(int studNo) {
		this.studNo = studNo;
	}
	public Student(int studNo, String studName) {
		this.studNo=studNo;
		this.StudName =studName;
	}
	
	
	
	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNo = studNo;
		this.StudName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	//����, ����,���� =>���� ����Ǹ� ���...
	public double getAvgScore() {
		return this.getSumScore() / 3.0;
	}
	//����, ����, ���� ==> �հ�����...
	
    int getSumScore() {
    	if (this.korScore != -1 && this.engScore != -1 && this.mathScore != -1) {
    			return this.korScore + this.engScore + this.mathScore;
    	
    	}
    	return -1;
    }

	// ��� (method) => ��Ģ ��ȯ�� �޼ҵ�� �Ű����� {}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public int getStudNo() {
		return this.studNo;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public String getStudInfo() {
		//Formatter f = new Formatter(new S)
		
		String str ="==========================";
		str += "\n �л��̸�: " + this.getStudName() +"�̰�";
		str += "\n �й�: " +this.getStudNo()+ "�̰�";
		str += "\n ���: " +String.format("%.2f", this.getAvgScore()) +"�Դϴ�.";
		str += "\n===============================\n";
		return str;
	}
}
