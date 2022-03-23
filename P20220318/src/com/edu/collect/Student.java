package com.edu.collect;

public class Student {
	int stuNo ;
	String stuName;
	int engScore;
	int korScore;
	
	Student() {}
	Student (int stuNo, String stuName, int engScore, int korScore) {
		this.stuNo=stuNo;
		this.stuName=stuName;
		this.engScore=engScore;
		this.korScore=korScore;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNum(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	//=> toString 재정의
	@Override
	public String toString() {
		
		return  "학생정보 [ 학생번호 : "+stuNo+" 학생이름 : " +
		stuName + " 영어점수 : " + engScore + " 국어점수 : "+ korScore
		+" ]";
	}
	
	
}
