package com.prod;

public class User {

	private String userId;
	private String userGrade;
	private String userPhNum;
	private int userPoint;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getUserPhNum() {
		return userPhNum;
	}

	public void setUserPhNum(String userPhNum) {
		this.userPhNum = userPhNum;
	}

	public int getUserPoint() {
		return userPoint;
	}

	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	public String getUserInfo () {
		String result = "����� ID��"+this.userId+"�̰� ����� "+this.userGrade+ //
				"  ����ó��"+ this.userPhNum+"�̰� ���� ����� ����Ʈ�� "+this.userPoint+"�Դϴ�";
	return result;
	}


}
