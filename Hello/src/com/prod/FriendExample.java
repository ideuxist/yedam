package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		//친구의 정보 (이름 , 전화번호, 이메일, 키, 몸무게)
		Friend f1 = new Friend();
		f1.friendName = "권가희";
		f1.friendPhone = "010 - 0000 - 0000";
		f1.email = "kkh@email.com";
		f1.tall = 167.5;
		f1.weigt = 55.7;
		
		Friend f2 = new Friend();
		f2.friendName = "이유빈";
		f2.friendPhone = "010 - 1111 - 2222";
		f2.email = "lyb@email.com";
		f2.tall = 156.5;
		f2.weigt = 45.7;
	
		Friend f3 = new Friend();
		f3.friendName = "나현주";
		f3.friendPhone = "010 - 3333 - 4444";
		f3.email = "nhj@email.com";
		f3.tall = 176.5;
		f3.weigt = 65.7;

		System.out.println(f1);
		
	Friend[] friends = {f1,f2,f3};
	
	for (int i=0; i<friends.length; i++) {
		if (friends[i].tall < 170) {
			System.out.println("이름:"+friends[i].friendName);
			System.out.println("전화번호:"+friends[i].friendPhone);
			System.out.println("키:"+friends[i].tall);
			System.out.println("=================================");
	}
	
	}
}
}
	
