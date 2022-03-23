package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Map:{key:value},{key1,value}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("전민욱", 80);
		map.put("김형민", 82);
		map.put("김영민", 85);// key 값은 중복x->value 구별하기위한 요소
		map.put("김영민", 0);// key 값 중복되면 기존의 값 덮어 씀

		// 컬렉션 : 여러값을 저장. 저장된값을 불러올 용도

		Integer val = map.get("김영민");
		System.out.println(val);

		Set<String> keySet = map.keySet();// 1.
		// map 컬렉션에 저장된 요소들의 키에 해당되는 값을
		// Set 컬렉션에 담아준다
		Iterator<String> iter = keySet.iterator();

		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key: %5s , value: %5d \n", key, value);
		}

		// 2.for( : ) 확장 for문
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.printf("key: %5s , value: %5d \n", key, value);
		}

		System.out.println("end of program");
	}

}
