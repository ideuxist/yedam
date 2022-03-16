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
		String result = "사용자 ID는"+this.userId+"이고 등급은 "+this.userGrade+ //
				"  연락처는"+ this.userPhNum+"이고 현재 사용자 포인트는 "+this.userPoint+"입니다";
	return result;
	}


}
