package com.prod;

public class UserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		u1.setUserId("yedam");
		u1.setUserGrade("A");
		u1.setUserPhNum("010-1111-1111");
		u1.setUserPoint(50000);
		
		User u2 = new User();
		u2.setUserId("seokj");
		u2.setUserGrade("B");
		u2.setUserPhNum("010-2222-2222");
		u2.setUserPoint(35000);
		
		User u3 = new User();
		u3.setUserId("kkw");
		u3.setUserGrade("C");
		u3.setUserPhNum("010-3333-3333");
		u3.setUserPoint(15000);
		
		System.out.println(u1.getUserInfo());
		System.out.println(u2.getUserInfo());
		System.out.println(u3.getUserInfo());
		
		User[] users = {u1,u2,u3};
		for (int i = 0; i < users.length; i++) {
		//	users[i].getUserGrade();
		//	System.out.println(users[i].getUserGrade());
		//	users[i].getUserPoint();
			
			if (users[i].getUserGrade() == "A"  ) {
				System.out.println("A등급의 유저는 " +users[i].getUserId());
			}
			}
		for (int i = 0; i < users.length; i++) {		
			if (users[i].getUserPoint() > 30000  ) {
				System.out.println("30000포인트 이상의 유저는 "+users[i].getUserId());	
				
				
				
				
				
				
				
			}
		}
}
}