package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
public static void main(String[] args) {
	// ���� : Error ,Exception
	
	try {
	double result = 13/0;
	System.out.println("���:" +result);
	} catch (ArithmeticException e) {
		e.printStackTrace();
		System.out.println("0���� ���� �� �����ϴ�");
	}
	
	
	Scanner scn = new Scanner(System.in);
	System.out.println("���ڸ� �Է��ϼ���");
	try {
		int menu = scn.nextInt();
		
	}catch (InputMismatchException e ) {
		System.out.println("���ڸ� ��Ȯ�� �Է��ϼ���");
	}
	scn.close();
System.out.println("end of prog");

}

}