package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	
	public static void main(StringExam1[] args) {
		Member obj1 = new Member("blue" ,"aa");
		Member obj2 = new Member("blue", "aa");	
		Member obj3 = new Member("red","aa");
		
		if (obj1==obj2) {
			System.out.println("obj1과 obj2는 동등합니다");
		}
		else {
			System.out.println("Obj1과 obj2는 동등하지 않습니다.");
		}
		
		// 배열 -> 컬렉션 (ArrayList , HashSet, HashMap):여러개의 값을 저장
		Member[] memberAry = new Member[5]; //Member의 인스턴스 최대 5개 저장
		                                    //크기 초과하면 새로운 배열선언. 복사
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user1", "홍길동"));
		for (int i=0; i<memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		
		HashSet<Member> memSet = new HashSet<Member>(); //
		memSet.add(new Member("user1", "홍길동"));//hashCode(), equals()
		memSet.add(new Member("user1", "홍길동"));
	System.out.println(memSet.size());
	}
}

