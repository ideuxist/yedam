package com.dev;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		// num1 num2 num3 ���� �Է� �޾�
		// ���������� ū������ ����
		Scanner scn = new Scanner(System.in);
//int val1,val2,val3;
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		int a = scn.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		int b = scn.nextInt();
		System.out.println("����° ���� �Է��Ͻÿ�");
		int c = scn.nextInt();
		if (a>b) {
			if (a>c) {
				if(b>c) {
					System.out.println(""+c+b+ a );
					}
			else {System.out.println(""+b +c+ a);
			}
			}
			else {System.out.println(""+b+ a+ c);
			}
		} else { if (b>c) {
			
			
				if (a>c) {System.out.println(""+c +a +b);}
				else {System.out.println(""+a +c+ b);}}
				else {System.out.println(""+a+ b +c);
				}}
				}
				
	}

