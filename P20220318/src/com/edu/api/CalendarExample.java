package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
		
		
		Calendar today = Calendar.getInstance();
		today.set(2022, 2, 1);
		System.out.println("올해는 : " + today.get(Calendar.YEAR));
		System.out.println("이달은 : " + (today.get(Calendar.MONTH)+1));
		System.out.println("오늘은 : " + today.get(Calendar.DATE));
		System.out.println("요일정보 : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막날의 정보: " +today.getActualMaximum(Calendar.DATE));
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		for (int i = 1; i <gapDay; i++) {
			System.out.printf("%4s","");
		} //1일의 위치지정
		
		for (int i=1; i<=lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i+gapDay-1) % 7 ==0) {
				System.out.println();
			//날짜 출력
			}
			
		}
			

			
		System.out.println("\nend of prog");
		}
		
          //프로그램 끝
	}


