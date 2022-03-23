package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//Set 중복값은 허용x
		set.add("Hello");
		set.add("world");
		set.add("world"); // 중복된 요소는 추가불가.
		set.add("Good");
		
		set.remove("Good");
		System.out.println("set크기 : "+  set.size());
		//순서 없이 저장 인덱스로 불러올수 없다
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		//Iterator<String> iter2 = set.iterator();
		while (iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		System.out.println("end of program");
	}

}
