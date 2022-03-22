package com.edu.api;

public class Member {

	private String id;
	private String name;

	public Member(String id,String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = null;
	if (obj instanceof Member) {
			member = (Member) obj;
			if (id.equals(member.id)&&name.equals(member.name)) {
				return true;
			}
	}
		System.out.println(member);
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1111;
	}

}
