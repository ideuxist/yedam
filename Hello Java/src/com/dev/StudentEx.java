package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudentEx {

	public static void main(String[] args) {
		// Scanner,�迭����5��, �Է�, ����Ʈ���.
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5];
		while(true) {
			System.out.println("1.�Է� 2.����Ʈ 3.����");
			System.out.print("����>");
			int menu = scn.nextInt();
			if (menu == 1) {
				//�Է±��� �й� �̸� ���� ���� ���� =>Student instance 
				//���� => �迭
				System.out.print("�й��� �Է��ϼ���>");
				int sno = scn.nextInt();
				System.out.print("�̸��� �Է��ϼ���>");
				String sname = scn.next();
				System.out.print("���������� �Է��ϼ���>");
				int escore = scn.nextInt();
				System.out.print("���������� �Է��ϼ���>");
				int kscore = scn.nextInt();
				System.out.print("���������� �Է��ϼ���>");
				int mscore = scn.nextInt();
				
				Student s1 = new Student(sno, sname, escore, kscore, mscore);
				for (int i=0; i<students.length; i++) {
					if (students[i] == null) {
						students[i]=s1;
						break;
					} 
				}
				System.out.println("����Ϸ�");
			
			}else if (menu == 2) {
				//����Ʈ..
				System.out.println("����Ʈ��");
				for (int i= 0;i < students.length; i++) {
					if (students[i] != null)
						System.out.println(students[i].getStudInfo());
				}
				
				
			}else if (menu == 3 ) {
				//����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			
			}else {
				System.out.println("�޴��� �߸� �����߽��ϴ�.");
				
			}
			
		}
	 System.out.println("end of program");
	 
		

	}

}

