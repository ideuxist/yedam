package com.edu.interfaces;

public class OracleDao implements Dao {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 조회합니다");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 입력합니다");
	}
	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 수정합니다");
	}
	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB에서 삭제합니다");
	}
	

}
