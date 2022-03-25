package com.edu.lambda.consumer;

import java.util.function.ToIntFunction;

import com.edu.io.Student;
public class FuntionExample {
	ToIntFunction<Student> func =
			(student) -> student.getEngScore()+student.getKorScore();
		
	    int result = func.applyAsInt(new Student(101,"Hong",80,90));
	    System.out.println("결과값: " + result);
		
	}

